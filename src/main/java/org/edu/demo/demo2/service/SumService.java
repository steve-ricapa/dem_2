package org.edu.demo.demo2.service;


import org.springframework.stereotype.Service;

@Service
public class SumService {

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
