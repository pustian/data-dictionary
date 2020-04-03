package tian.pusen.data.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tian.pusen.data.entity.Test;
import tian.pusen.data.service.ITestService;

import java.util.List;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String Hello() {
        return "hello world";
    }

    @Autowired
    ITestService testService;

    @GetMapping("/test/{id}")
    public Test getById(@PathVariable(name="id", value="1") String id) {
        return testService.getById(Long.parseLong(id) );
    }

    @GetMapping("/tests")
    public List<Test> getAll() {
        return testService.getAll();
    }

    @PostMapping("/test")
    public Integer insert(@RequestBody Test test) {
        return testService.insert(test);
    }
}
