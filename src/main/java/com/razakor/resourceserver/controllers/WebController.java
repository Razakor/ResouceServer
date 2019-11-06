package com.razakor.resourceserver.controllers;

import com.razakor.resourceserver.services.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private final QuestionService questionService;

    public WebController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/tobe")
    public String tobe() {
        return questionService.findAll().toString();
    }
}
