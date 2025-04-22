package org.edu.demo.demo2.controller;
import org.edu.demo.demo2.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SumController {
    @Autowired
    private SumService sumService;

    @GetMapping("/div")
    public float div(@RequestParam float num1,@RequestParam float num2) {
        return sumService.addNumbers(num1, num2);
    }
}
