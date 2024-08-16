package com.soham.thymeleaf_demo.controller;

import com.soham.thymeleaf_demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("variable-demo")
    public String variableExpression(Model model) {
        User user = new User(
                "Soham",
                "soham@gmail.com",
                "ADMIN",
                "M"
        );

        model.addAttribute("user", user);

        return "variable-expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User(
                "Soham",
                "soham@gmail.com",
                "ADMIN",
                "M"
        );

        model.addAttribute("user", user);

        return "selection-expression";
    }


    @GetMapping("message-expression")
    public String messageExpression(Model model) {
        return "message-expression";
    }

    @GetMapping("link-expression")
    public String linkExpression() {
        return "link-expression";
    }
}
