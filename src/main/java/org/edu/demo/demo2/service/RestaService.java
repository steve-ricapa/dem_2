package org.edu.demo.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class RestaService {

    public int restNumbers(int a, int b) {
        return a - b;
    }

}
