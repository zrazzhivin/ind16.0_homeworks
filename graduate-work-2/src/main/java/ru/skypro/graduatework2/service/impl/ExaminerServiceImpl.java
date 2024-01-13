package ru.skypro.graduatework2.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.graduatework2.exception.IncorrectAmountException;
import ru.skypro.graduatework2.model.Question;
import ru.skypro.graduatework2.service.ExaminerService;
import ru.skypro.graduatework2.service.QuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (questionService.getAll().size() < amount) {
            throw new IncorrectAmountException("Недостаточно вопросов в хранилище");
        }

        Set<Question> questions = new HashSet<>();

        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }

        return questions;
    }
}
