package com.ssm.service.impl;

import com.ssm.entity.TableForSSM;
import com.ssm.mapper.TestMapper;
import com.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper mapper;

    @Override
    public String test() {
        return "success ---";
    }

    @Override
    public String add(TableForSSM entity) {
        mapper.add(entity);
        return "success";
    }

    @Override
    public String get() {
        String phone = mapper.get("a");
        return phone;
    }
}
