package com.sdet.SpringSeleniumTest.service;

import com.sdet.SpringSeleniumTest.dto.ExecutionRequest;
import org.springframework.stereotype.Service;

@Service
public class ExecutionService {
    public boolean executeTests(ExecutionRequest executionRequest)
    {
        return true;
    }

    public boolean executeTests(String tags)
    {
        return true;
    }
}
