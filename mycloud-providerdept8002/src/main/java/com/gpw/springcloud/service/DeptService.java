package com.gpw.springcloud.service;

import com.gpw.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: Gpw
 * @Date: 2019/6/7
 * @Description: com.gpw.springcloud.service
 * @Version: 1.0
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept    get(Long id);

    public List<Dept> list();
}
