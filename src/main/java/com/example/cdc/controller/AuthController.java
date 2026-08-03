package com.example.cdc.controller;

import com.example.cdc.dto.JwtResponse;
import com.example.cdc.dto.LoginRequest;
import com.example.cdc.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest request) {

        return authService.login(request);

    }

}