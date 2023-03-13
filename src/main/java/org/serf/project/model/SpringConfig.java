package org.serf.project.model;

import org.serf.project.dao.StudentDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "studentDAO")
    public StudentDAO studentDAO(){
        return new StudentDAO();
    }

    @Bean(name = "student")
    public Student student(){
        return new Student(0, "Alex", 25);
    }
}
