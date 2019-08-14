package com.example.demo.Controller;

import com.example.demo.Model.StudentBindingModel;
import com.example.demo.Repo.StudentRepository;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    private StudentRepository studentRepository;

    @Autowired
    public HomeController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public ModelAndView home(ModelAndView modelAndView){
      List<String> stNames =  this.studentRepository.findAll()
              .stream()
              .map(Student::getName)
              .collect(Collectors.toList());
        modelAndView.addObject("studentNames",stNames);
        modelAndView.setViewName("home");
        return modelAndView;
    }
    @GetMapping("/student/edin/{id}")
    public String getOne(@PathVariable("id")Integer id, Model model){
        Student student = this.studentRepository.findAllById(id).get();

        model.addAllAttributes("student",student);
    }

    @PostMapping("/student/create")
    public String createStudent(StudentBindingModel model){
        Student student = new Student();
        student.setAge(model.getName());
        student.setAge(model.getAge());
        student.getNumber(model.getNumber());

        this.studentRepository.saveAndFlush(student);

        return "redirect:/";

    }


}
