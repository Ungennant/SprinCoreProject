package org.serf.project.lesson19.controller;

import org.serf.project.lesson19.model.Student;
import org.serf.project.lesson19.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/uploadStudent")
    public String uploadStudent(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
                                 @RequestParam("age") int age, @RequestParam("file") MultipartFile file) throws IOException {
        Student student = studentService.storeStudent(firstName, lastName, age, file);

        return "redirect:/cabinet";
    }

    @GetMapping("/cabinet")
    public String cabinet(){
        return "cabinet";
    }
}
