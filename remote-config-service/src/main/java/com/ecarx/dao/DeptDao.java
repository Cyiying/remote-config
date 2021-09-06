package com.ecarx.dao;

import com.ecarx.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeptDao {
    Dept getPaymentById(@Param("deptNo") Long deptNo);
}
