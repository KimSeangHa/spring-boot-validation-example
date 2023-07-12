package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserDto {
    @NotBlank(message = "이름은 필수 항목입니다.")
    private String name;

    @Email(message = "이메일 형식을 올바르게 입력해주세요.")
    private String email;
}
