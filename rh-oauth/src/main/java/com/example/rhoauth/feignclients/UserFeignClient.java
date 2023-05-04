package com.example.rhoauth.feignclients;

import com.example.rhoauth.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "rh-usuario", path = "/users")
public interface UserFeignClient {

    @GetMapping(value = "/search")
    ResponseEntity<User> findBySearch(@RequestParam String email);
}
