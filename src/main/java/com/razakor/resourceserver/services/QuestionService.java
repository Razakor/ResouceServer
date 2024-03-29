package com.razakor.resourceserver.services;

import com.razakor.resourceserver.document.Question;
import com.razakor.resourceserver.repositories.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void save(Question question) {
        questionRepository.save(question);
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Question findById(String id) {
        return questionRepository.findById(id).orElse(new Question());
    }

}
