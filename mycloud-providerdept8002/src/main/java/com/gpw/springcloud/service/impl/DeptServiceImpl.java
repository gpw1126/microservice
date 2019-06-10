package com.gpw.springcloud.service.impl;

import com.gpw.springcloud.dao.DeptDao;
import com.gpw.springcloud.entities.Dept;
import com.gpw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Gpw
 * @Date: 2019/6/7
 * @Description: com.gpw.springcloud.service.impl
 * @Version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return this.dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return this.dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return this.dao.findAll();
    }
}
