package com.razakor.resourceserver.bootstrap;

import com.razakor.resourceserver.document.Question;
import com.razakor.resourceserver.services.QuestionService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationRunner {

    private final QuestionService questionService;

    public Bootstrap(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public void run(ApplicationArguments args) {

        //Question question = new Question("To be or not to be?", "That is the question");
        //questionService.save(question);
    }
}
