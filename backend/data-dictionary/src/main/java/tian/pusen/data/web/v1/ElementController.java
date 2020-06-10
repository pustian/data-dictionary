package tian.pusen.data.web.v1;


import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tian.pusen.data.entity.Element;
import tian.pusen.data.service.IElementService;

import java.util.List;

/**
 * <p>
 * 数据项 前端控制器
 * </p>
 *
 * @author 田圃森
 * @since 2020-04-06
 */
@RestController
public class ElementController {
    @Autowired
    IElementService elementService;

    @ApiOperation("分页查询")
    @GetMapping("elements/pages/")
    public Page<Element> getPage(
            @ApiParam("当前页，从1开始计数.0作为1对待") @RequestParam(defaultValue = "1") Integer currentPageNo,
            @ApiParam("每页记录数") @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description) {
        EntityWrapper<Element> ew = new EntityWrapper<Element>();
        ew.like("name", name, SqlLike.DEFAULT);
        ew.like("description", description, SqlLike.DEFAULT);
        ew.orderBy("id", true);
        Page<Element> pageCluase = new Page<Element>(currentPageNo, pageSize);
        return elementService.selectPage(pageCluase, ew);
    }

    @ApiOperation("查询 模糊查询支持name，description")
    @GetMapping("elements/")
    public List<Element> getLists(@RequestParam(required = false) String name, @RequestParam(required = false) String description) {
        EntityWrapper<Element> ew = new EntityWrapper<Element>();
        ew.like("name", name, SqlLike.DEFAULT);
        ew.like("description", description, SqlLike.DEFAULT);
        ew.orderBy("id", true);
        return elementService.selectList(ew);
    }


    @PostMapping("elements")
    @PutMapping("elements")
    public boolean insert(@RequestBody Element element) {
        return elementService.insert(element);
    }

    @DeleteMapping("elements/{id}")
    public boolean delete(@PathVariable Integer id) {
        Element clause = new Element();
        clause.setId(id);
        EntityWrapper<Element> ew = new EntityWrapper<>(clause);

        Element updateElement = new Element();
        updateElement.setStatus(9);

        return elementService.update(updateElement, ew);
//        return elementService.deleteById(id);
    }

    @PatchMapping("elements")
    public boolean update(@RequestBody Element element) {
        Element clause = new Element();
        if(element.getId() == null) {
            return false;
        }
        clause.setId(element.getId());
        EntityWrapper<Element> ew = new EntityWrapper(clause);

        return elementService.update(element, ew);
    }

}

