package net.yfantidis.EAPPLI.controllers;

import org.springframework.ui.Model;
import net.yfantidis.EAPPLI.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping("/students")
    public String getStudents(Model model){

        model.addAttribute("students", studentRepository.findAll());


        return "students/List";
    }
}
