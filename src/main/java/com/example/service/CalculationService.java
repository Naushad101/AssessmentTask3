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
            log.info("Starting the executeTasks method");

            executorService = Executors.newFixedThreadPool(8);

            executorService.submit(() -> squareTask());
            executorService.submit(() -> cubeTask());
            executorService.submit(() -> factorialTask());
            executorService.submit(() -> armstrongTask());
            executorService.submit(() -> palindromeTask());
            executorService.submit(() -> evenTask());
            executorService.submit(() -> primeTask());
            executorService.submit(() -> reverseTask());

        } catch (Exception e) {
            log.error("Exception occurred while executing tasks: " + e.getMessage(), e);
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                log.info("Executor service shutdown initiated");
            }
        }
    }

    private void squareTask() {
        try {
            int result = square(number);
            System.out.println("Square of " + number + " is: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in squareTask: " + e.getMessage(), e);
        }
    }

    private void cubeTask() {
        try {
            int result = cube(number);
            System.out.println("Cube of " + number + " is: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in cubeTask: " + e.getMessage(), e);
        }
    }

    private void factorialTask() {
        try {
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in factorialTask: " + e.getMessage(), e);
        }
    }

    private void armstrongTask() {
        try {
            boolean result = isArmstrong(number);
            System.out.println(number + " is Armstrong: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in armstrongTask: " + e.getMessage(), e);
        }
    }

    private void palindromeTask() {
        try {
            boolean result = isPalindrome(number);
            System.out.println(number + " is palindrome: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in palindromeTask: " + e.getMessage(), e);
        }
    }

    private void evenTask() {
        try {
            boolean result = isEven(number);
            System.out.println(number + " is even: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in evenTask: " + e.getMessage(), e);
        }
    }

    private void primeTask() {
        try {
            boolean result = isPrime(number);
            System.out.println(number + " is prime: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in primeTask: " + e.getMessage(), e);
        }
    }

    private void reverseTask() {
        try {
            int result = reverse(number);
            System.out.println("Reverse of " + number + " is: " + result);
        } catch (Exception e) {
            log.error("Exception occurred in reverseTask: " + e.getMessage(), e);
            
        }
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
