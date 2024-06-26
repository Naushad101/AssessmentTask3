package com.example.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalculationService {

    private int number;

    public CalculationService(int number) {
        this.number = number;
    }

    public void executeTasks() {
        ExecutorService executorService = null;

        try {
            log.info("Started the executeService");
            executorService=Executors.newFixedThreadPool(8);
        executorService.submit(this::squareTask);
        executorService.submit(this::cubeTask);
        executorService.submit(this::factorialTask);
        executorService.submit(this::armstrongTask);
        executorService.submit(this::palindromeTask);
        executorService.submit(this::evenTask);
        executorService.submit(this::primeTask);
        executorService.submit(this::reverseTask);
        } catch (Exception e) {
            log.warn("Error Occured ",e.getMessage());
        }
        finally{
            executorService.shutdown();
            log.info("Closed the executeService");
        }
    }

    private void squareTask() {
        int result = square(number);
        System.out.println("Square of " + number + " is: " + result);
    }

    private void cubeTask() {
        int result = cube(number);
        System.out.println("Cube of " + number + " is: " + result);
    }

    private void factorialTask() {
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private void armstrongTask() {
        boolean result = isArmstrong(number);
        System.out.println(number + " is Armstrong: " + result);
    }

    private void palindromeTask() {
        boolean result = isPalindrome(number);
        System.out.println(number + " is palindrome: " + result);
    }

    private void evenTask() {
        boolean result = isEven(number);
        System.out.println(number + " is even: " + result);
    }

    private void primeTask() {
        boolean result = isPrime(number);
        System.out.println(number + " is prime: " + result);
    }

    private void reverseTask() {
        int result = reverse(number);
        System.out.println("Reverse of " + number + " is: " + result);
    }

    public int square(int number) {
        return number * number;
    }

    public int cube(int number) {
        return number * number * number;
    }

    public int factorial(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return originalNumber == sum;
    }

    public boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
