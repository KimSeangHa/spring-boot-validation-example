package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class testController {
    @GetMapping("/user")
    public ResponseEntity<UserDto> test(@Valid UserDto user) {

        return new ResponseEntity(user, HttpStatus.OK);
    }
}
