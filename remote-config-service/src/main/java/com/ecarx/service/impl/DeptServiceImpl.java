package com.ecarx.service.impl;

import com.ecarx.dao.DeptDao;
import com.ecarx.entity.Dept;
import com.ecarx.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    public Dept getPaymentById(Long id) {
        return deptDao.getPaymentById(id);
    }
}
