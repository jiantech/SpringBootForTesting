package com.sdet.SpringSeleniumTest.dto;

public class ExecutionRequest {
    private String[] tags;

    public String getTags() {
        return String.join(",", tags);
    }
}
