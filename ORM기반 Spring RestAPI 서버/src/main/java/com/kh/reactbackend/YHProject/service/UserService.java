package com.kh.reactbackend.YHProject.service;

import com.kh.reactbackend.YHProject.dto.UserDto;
import com.kh.reactbackend.YHProject.entity.User;
import com.kh.reactbackend.YHProject.repository.UserRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRespository userRespository;

    public String save(UserDto.RegisterRequest registerRequest) {
        User user = registerRequest.toEntity();
        userRespository.save(user);
        return user.getId();
    }

    @Transactional(readOnly = true)
    public User Login(String id, String password) {
        return userRespository.Login(id, password);
    }
}
