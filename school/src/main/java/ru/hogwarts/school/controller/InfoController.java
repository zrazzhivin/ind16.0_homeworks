package ru.hogwarts.school.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class InfoController {

    private final Logger logger = LoggerFactory.getLogger(InfoController.class);

    @Value("${server.port}")
    private Integer port;

    @GetMapping("port")
    public int getPort() {
        return port;
    }

    @GetMapping("sum")
    public long calculateSum() {

        // method 1
        long startTime = System.currentTimeMillis();
        long sum = Stream.iterate(1, a -> a +1)
                .limit(10_000_000)
                .reduce(0, (a, b) -> a + b );
        long finishTime = System.currentTimeMillis();

        logger.info("Метод 1 занял " + (finishTime - startTime));

        // method 2
        startTime = System.currentTimeMillis();
        sum = Stream.iterate(1, a -> a +1)
                .limit(10_000_000)
                .parallel()
                .reduce(0, (a, b) -> a + b );
        finishTime = System.currentTimeMillis();

        logger.info("Метод 2 занял " + (finishTime - startTime));

        // method 3
        startTime = System.currentTimeMillis();
        sum = 0;
        for (int i = 0; i <= 10_000_000; i++) {
            sum += i;
        }
        finishTime = System.currentTimeMillis();

        logger.info("Метод 3 занял " + (finishTime - startTime));


        return sum;
    }
}
