package com.gpw.springcloud.controller;

import com.gpw.springcloud.entities.Dept;
import com.gpw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Gpw
 * @Date: 2019/6/7
 * @Description: com.gpw.springcloud.controller
 * @Version: 1.0
 */
@RestController
public class DeptController {

    @Autowired
    DeptService service;

    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }
}
