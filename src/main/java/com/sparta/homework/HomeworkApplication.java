package com.sparta.homework;

import com.sparta.homework.dto.BlogRequestDto;
import com.sparta.homework.entity.Blog;
import com.sparta.homework.repository.BlogRepository;
import com.sparta.homework.service.BlogService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkApplication.class, args);
    }
}
