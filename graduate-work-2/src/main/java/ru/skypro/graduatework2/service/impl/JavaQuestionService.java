package ru.skypro.graduatework2.service.impl;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ru.skypro.graduatework2.model.Question;
import ru.skypro.graduatework2.service.QuestionService;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final Set<Question> questions = new HashSet<>();

    private final Random random = new Random();

    @PostConstruct
    public void init() {
        add("Какие бывают типы данных?", "Примитивы и ссылочные");
        add("В каких двух областях памяти хранятся переменные?", "Стек и куча");
        add("От какого класса наследуются все исключсения в джаве?", "Throwable");
        add("Какие основные принципы ООП? (3)", "Полиморфизм, инкапсуляция, наследование");
    }

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        int randomIndex = random.nextInt(questions.size());
        return new ArrayList<>(questions).get(randomIndex);
    }
}
