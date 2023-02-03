package com.springmicroservices.user.controller;

import com.springmicroservices.user.VO.ResponseTemplateVO;
import com.springmicroservices.user.entity.MUser;
import com.springmicroservices.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public MUser saveUser(@RequestBody MUser mUser){
        log.info("Inside SaveUser method of UserController");
        return userService.saveUser(mUser);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment method of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
