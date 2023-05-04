package com.example.rhoauth.services;

import com.example.rhoauth.entities.User;
import com.example.rhoauth.feignclients.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){
        logger.info("CHEGOU O EMAIL: "+email);
        User user = userFeignClient.findBySearch(email).getBody();
        if(user == null){
            logger.error("EMAIL not found: "+email);
            throw new IllegalArgumentException("Email not found");
        }
        logger.info("Email found: "+email);
        return user;
    }
}
