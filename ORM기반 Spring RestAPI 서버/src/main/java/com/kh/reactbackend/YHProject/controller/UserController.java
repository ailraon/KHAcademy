package com.kh.reactbackend.YHProject.controller;

import com.kh.reactbackend.YHProject.dto.UserDto;
import com.kh.reactbackend.YHProject.entity.User;
import com.kh.reactbackend.YHProject.repository.UserRespository;
import com.kh.reactbackend.YHProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<String> createUser(@RequestBody UserDto.RegisterRequest request) {
        String userId = userService.save(request);
        return ResponseEntity.ok(userId);
    }
}
