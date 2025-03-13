package com.example.jasper_reports.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportController {
    @GetMapping("/employees")
    public ResponseEntity<String> generateEmployeeReport() {
        return ResponseEntity.ok("Hello, World!");
    }
}
