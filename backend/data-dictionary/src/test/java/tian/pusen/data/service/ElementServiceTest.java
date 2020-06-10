package tian.pusen.data.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tian.pusen.data.entity.Element;

import javax.swing.text.html.parser.Entity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElementServiceTest {
    @Autowired
    IElementService elementService;

    @Test
    public void pageTest() {
        EntityWrapper<Element> elementClause = new EntityWrapper<>();
        int currentPageNo = 1;
        int size =3;
        Page<Element> pageClause = new Page<Element>(currentPageNo, size);
        Page<Element> elementPage = elementService.selectPage(pageClause, elementClause);
        Assert.assertTrue(elementPage.getTotal() > 0);
    }
}
