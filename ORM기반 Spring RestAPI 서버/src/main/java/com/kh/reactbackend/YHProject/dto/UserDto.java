package com.kh.reactbackend.YHProject.dto;

import com.kh.reactbackend.YHProject.entity.User;
import lombok.*;

public class UserDto {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RegisterRequest {
        private String id;
        private String password;
        private String name;
        private Integer age;

        public User toEntity() {
            return User.builder()
                    .id(id)
                    .password(password)
                    .name(name)
                    .age(age)
                    .build();
        }
    }

    @Getter
    @Setter
    public static class LoginRequest {
        private String id;
        private String password;
    }

    @Getter
    @Setter
    public static class UpdateRequest {
        private String password;
        private String name;
        private Integer age;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response {
        private String id;
        private String name;
        private Integer age;

        public static Response toDto(User user) {
            return Response.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .age(user.getAge())
                    .build();
        }
    }
}
