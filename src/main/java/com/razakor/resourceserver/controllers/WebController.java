package com.razakor.resourceserver.controllers;

import com.razakor.resourceserver.document.Question;
import com.razakor.resourceserver.services.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    private final QuestionService questionService;

    public WebController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(value = "/questions")
    public List<Question> getQuestions() {
        return questionService.findAll();
    }
}
