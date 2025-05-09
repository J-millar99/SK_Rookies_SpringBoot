package com.basic.myspringboot.controller;

import com.basic.myspringboot.entity.Customer;
import com.basic.myspringboot.repository.CustomerRepository;
import com.basic.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // final인 변수를 초기화하는 생성자를 자동으로 생성해주는 역할을 하는 롬복 어노테이션
@RequestMapping("/api/users")
public class UserRestController {
    private final UserRepository userRepository;

    // Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        System.out.println(">>> UserController " + userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }

}
