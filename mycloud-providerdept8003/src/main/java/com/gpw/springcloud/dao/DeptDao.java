package com.gpw.springcloud.dao;

import com.gpw.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Gpw
 * @Date: 2019/6/7
 * @Description: com.gpw.springcloud.dao
 * @Version: 1.0
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
