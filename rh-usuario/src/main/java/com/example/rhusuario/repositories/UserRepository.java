package com.example.rhusuario.repositories;

import com.example.rhusuario.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    /*
     this is a way to assign one method using query methods
     reference: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords
     */
    User findByEmail(String email);
}
