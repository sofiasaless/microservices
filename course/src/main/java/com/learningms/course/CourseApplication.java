package com.learningms.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// com a modularização do projeto é necessário dizer ao spring que ele escaneie os módulos necessários para a aplicação
@EntityScan({"com.learningms.core.model"})
@EnableJpaRepositories({"com.learningms.core.repository"})
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}
