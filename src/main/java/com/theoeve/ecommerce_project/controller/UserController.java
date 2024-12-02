package com.theoeve.ecommerce_project.controller;

import com.theoeve.ecommerce_project.model.User;
import com.theoeve.ecommerce_project.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    private List<User> users = new ArrayList<>(List.of(
//            new User(1, "Tom", "pass", "tom@email.fr"), new User(2, "Calvin", "pass", "calvin@email.fr")
//    ));

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();

    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest servletRequest) {
        return (CsrfToken) servletRequest.getAttribute("_csrf");
    }


    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        return userService.verify(user);
    }
}
