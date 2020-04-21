package tian.pusen.data.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.data.entity.Test;
import tian.pusen.data.service.ITestService;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    ITestService testService;

    @GetMapping("/hello")
    public String Hello() {
        return "hello world";
    }

    @GetMapping("/tests")
    public List<Test> teests() {
        return testService.selectList(null);
    }
    @GetMapping("/tests/{id}")
    public Test getById(@PathVariable Long id) {
        return testService.selectById(id);
    }
}
