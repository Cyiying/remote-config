package com.ecarx.controller;

import com.ecarx.entity.Dept;
import com.ecarx.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {
    @Resource
    private DeptService deptService;

    @GetMapping(value = "/payment/get/{id}")
    public Dept getPaymentById(@PathVariable("id") Long id) {
        Dept dept = deptService.getPaymentById(id);
        return dept;
    }

}
