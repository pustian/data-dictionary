package tian.pusen.data.web.v1;


import com.baomidou.mybatisplus.enums.SqlLike;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tian.pusen.data.entity.Element;
import tian.pusen.data.entity.ElementItem;
import tian.pusen.data.service.IElementItemService;

import java.util.List;

/**
 * <p>
 * 数据项明细 前端控制器
 * </p>
 *
 * @author 田圃森
 * @since 2020-04-06
 */
@RestController
public class ElementItemController {
    @Autowired
    IElementItemService elementItemService;

    @ApiOperation("根据elementId分页查询")
    @GetMapping("elementItems/getByelementId/pages/")
    public Page<ElementItem> getPageByelementId(
            @ApiParam("当前页，从1开始计数.0作为1对待") @RequestParam(defaultValue = "1" ) Integer currentPageNo,
            @ApiParam("每页记录数")         @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "1") Integer elementId) {
        EntityWrapper<ElementItem> ew = new EntityWrapper<ElementItem>();
        ew.eq("elementId", elementId);
        ew.orderBy("id", true);
        Page<ElementItem> pageCluase = new Page<ElementItem>(currentPageNo, pageSize);
        return elementItemService.selectPage(pageCluase, ew);
    }

    @ApiOperation("根据elementId查询")
    @GetMapping("elementItem/getByelementId")
    public List<ElementItem> getListByelementId(@RequestParam Integer elementId) {
        ElementItem elementItemClause = new ElementItem();
        EntityWrapper<ElementItem> ew = new EntityWrapper<ElementItem>(elementItemClause);
        ew.orderBy("id", true);
        return elementItemService.selectList(ew);
    }


    @PostMapping("elementItems")
    @PutMapping("elementItems")
    public boolean insert(@RequestBody ElementItem elementItem) {
        return elementItemService.insert(elementItem);
    }

    @ApiOperation("根据elementId删除")
    @DeleteMapping("elementItems")
    public boolean deleteByElementId(@RequestParam("elementId") Integer id) {
        ElementItem clause = new ElementItem();
        clause.setElementId(id);
        EntityWrapper<ElementItem> ew = new EntityWrapper<>(clause);

        ElementItem updateElementItem = new ElementItem();
        updateElementItem.setStatus(9);

        return elementItemService.update(updateElementItem, ew);
//        return elementService.deleteById(id);
    }

    @ApiOperation("根据id删除")
    @DeleteMapping("elementItems/{id}")
    public boolean delete(@PathVariable Integer id) {
        ElementItem clause = new ElementItem();
        clause.setId(id);
        EntityWrapper<ElementItem> ew = new EntityWrapper<>(clause);

        ElementItem updateElementItem = new ElementItem();
        updateElementItem.setStatus(9);

        return elementItemService.update(updateElementItem, ew);
//        return elementService.deleteById(id);
    }
    @ApiOperation("根据id修改")
    @PatchMapping("elementItems")
    public boolean update(@RequestBody ElementItem elementItem) {
        ElementItem clause = new ElementItem();
        if(elementItem.getId() == null) {
            return false;
        }
        clause.setId(elementItem.getId());
        EntityWrapper<ElementItem> ew = new EntityWrapper(clause);

        return elementItemService.update(elementItem, ew);
    }

}

