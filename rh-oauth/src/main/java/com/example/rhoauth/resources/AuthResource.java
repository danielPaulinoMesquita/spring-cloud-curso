package com.example.rhoauth.resources;

import com.example.rhoauth.entities.User;
import com.example.rhoauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/oauth")
public class AuthResource {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users/search")
    public ResponseEntity<User> findByEmail(@RequestParam String search){
        try {
            User user = userService.findByEmail(search);
            return ResponseEntity.ok(user);
        } catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
