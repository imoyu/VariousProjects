package com.ssm.service.impl;

import com.ssm.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "success ---";
    }
}
