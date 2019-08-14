package com.example.demo.controller;


import com.example.demo.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class homeController {

    List<User> users;

    public homeController() {
        this.users = new ArrayList<>();
        this.createSomeUsers();
    }

    private void createSomeUsers() {


    }

    @GetMapping("/pesho")
    public String showPesho(Model model) {
//        User users = new User("Pesho", "pesho@petkov.com", "password");
        model.addAttribute("name", "Pesho");
        model.addAttribute("email", "pesho@petkov.com");
        model.addAttribute("password", "password");

        return "home";
    }
}
