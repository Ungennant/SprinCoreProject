package org.serf.project;

import org.serf.project.model.University;
import org.serf.project.service.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        UniversityService service = ctx.getBean(UniversityService.class);

        University university = new University("TestUniversity", "V", 32, 3200,"TestAddr");
        University university1 = new University("TestUniversity1", "V", 44, 4400,"TestAddr1");

        service.createUniversity(university);
        service.findUniversityById(1);
        service.updateUniversity(1, university1);
        List<University> all = service.findAll();
        System.out.println(all);
        service.deleteUniversity(1);



    }

}
