package tian.pusen.data.service;


import tian.pusen.data.entity.Test;

import java.util.List;

public interface ITestService {
    Integer insert(Test test);

    Test getById(Long id);

    List<Test> getAll();
}
