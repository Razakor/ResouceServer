package com.razakor.resourceserver.controllers;

import com.razakor.resourceserver.document.Question;
import com.razakor.resourceserver.services.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(value = "/getAllQuestions")
    public List<Question> getAllQuestions() {
        return questionService.findAll();
    }

    @RequestMapping(value = "/getQuestionById")
    public Question getQuestionById(@RequestParam String id) {
        return questionService.findById(id);
    }
}
