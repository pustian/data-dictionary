package tian.pusen.data.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tian.pusen.data.entity.Test;
import tian.pusen.data.mapper.TestMapper;
import tian.pusen.data.service.ITestService;

import java.util.List;

@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public Integer insert(Test test) {
        return testMapper.insertRecord(test);
    }

    @Override
    public Test getById(Long id) {
        return testMapper.getById(id);
    }

    @Override
    public List<Test> getAll() {
        return testMapper.getAll();
    }
}
