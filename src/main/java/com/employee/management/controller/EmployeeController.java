package com.employee.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = "/api/v1.0"
)
public class EmployeeController {

    @GetMapping(
            path = "/status"
    )
    public String getStatus(){
        return "up";
    }
}
