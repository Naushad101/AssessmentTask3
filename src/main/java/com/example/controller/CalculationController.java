package com.example.controller;

import com.example.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class CalculationController {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    static{
        System.out.println("Enter the number:");
    }
    CalculationService service = new CalculationService(number);


    @GetMapping("/run")
    public void getAllrun() {
        service.executeTasks();
    }
}
