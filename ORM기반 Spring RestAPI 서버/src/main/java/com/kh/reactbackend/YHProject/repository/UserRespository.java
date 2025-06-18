package com.kh.reactbackend.YHProject.repository;

import com.kh.reactbackend.YHProject.entity.User;

public interface UserRespository {
    void save(User user);
    User Login(String id, String password);
}
