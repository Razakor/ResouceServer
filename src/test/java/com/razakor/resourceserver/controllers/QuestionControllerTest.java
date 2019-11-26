package com.razakor.resourceserver.controllers;

import com.razakor.resourceserver.document.Question;
import com.razakor.resourceserver.repositories.QuestionRepository;
import com.razakor.resourceserver.services.QuestionService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuestionControllerTest {

    @Autowired
    private QuestionService questionService;

    @MockBean
    private QuestionRepository questionRepository;

    @Test
    void getAllQuestions() {
        Mockito.when(questionRepository.findAll())
                .thenReturn(
                        Stream.of(
                                new Question("q1", "a1"),
                                new Question("q2", "a2")
                        ).collect(Collectors.toList())
                );

        assertEquals(2, questionService.findAll().size());
    }

    @Test
    void getQuestionById() {
        Mockito.when(questionRepository.findById("id"))
                .thenReturn(Optional.of(new Question("q3", "a3")));

        Question question = questionService.findById("id");

        assertEquals("q3", question.getQuestion());
        assertEquals("a3", question.getAnswer());
    }
}