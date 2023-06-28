package com.klyucherov.test.sevice;

import com.klyucherov.test.exception.DivByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Number plus(int a, int b) {
        return a+b;
    }
    public Number minus(int a, int b) {
        return a-b;
    }
    public Number multiplication(int a, int b) {
        return a*b;
    }
    public Number division(int a, int b) {
        if (b == 0) {
            throw new  DivByZeroException();
        }
        return a / b;
    }
}
