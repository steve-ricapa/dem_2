package org.edu.demo.demo2.controller;


import org.edu.demo.demo2.service.RestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaController {
    @Autowired
    private RestaService restaService;

    @GetMapping("/resta")
    public int resta(@RequestParam int num1, @RequestParam int num2){
        return restaService.restNumbers(num1,num2);
    }

}
