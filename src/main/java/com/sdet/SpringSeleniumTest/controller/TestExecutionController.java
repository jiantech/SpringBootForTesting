package com.sdet.SpringSeleniumTest.controller;

import com.sdet.SpringSeleniumTest.dto.ExecutionRequest;
import com.sdet.SpringSeleniumTest.service.ExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestExecutionController {

    @Autowired
    private ExecutionService executionService;

    @RequestMapping(value = "/executeTest", method = RequestMethod.POST)
    public ResponseEntity< String > persistPerson(@RequestBody ExecutionRequest executionRequest) {
        if (executionService.executeTests(executionRequest)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(executionRequest.getTags());
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }

    @RequestMapping(value = "/executeTest/tags", method = RequestMethod.POST)
    public ResponseEntity< String > persistPerson(@RequestParam(value = "tags") String params) {
        if (executionService.executeTests(params)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(params);
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
    }
}
