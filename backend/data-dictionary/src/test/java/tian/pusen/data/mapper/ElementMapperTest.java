package tian.pusen.data.mapper;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tian.pusen.data.entity.Element;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElementMapperTest {
    @Autowired
    ElementMapper elementMapper;

    @Test
    public void getById() {
        Element element = elementMapper.selectById(1);
    }

    @Test
    public void getForPage() {
        int currentPageNo = 1;
        int pageSize =3;
        EntityWrapper<Element> elementClause = new EntityWrapper<>();
        Page<Element> pageClause = new Page<Element>(currentPageNo, pageSize);//参数一是当前页，参数二是每页个数
        List<Element> elementPage =  elementMapper.selectPage(pageClause, elementClause);
        System.out.println(elementPage.size() );
        Assert.assertTrue(elementPage.size() > 0 );
    }


}
