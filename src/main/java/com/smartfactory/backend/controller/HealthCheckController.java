package com.smartfactory.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/api/health")
    public String healthCheck() {
        return "스마트팩토리 백엔드 서버가 정상적으로 실행 중입니다!";
    }
}