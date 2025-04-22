package org.edu.demo.demo2.service;


import org.springframework.stereotype.Service;

@Service
public class SumService {

    public float addNumbers(float num1, float num2) {
        return num1/num2;
    }
}
