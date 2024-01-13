package ru.skypro.graduatework2.service;

import ru.skypro.graduatework2.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
