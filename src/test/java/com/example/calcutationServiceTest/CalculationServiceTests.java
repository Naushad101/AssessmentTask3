package com.example.calcutationServiceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.CalculationService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalculationServiceTests {

    @Mock
    private CalculationService calculationService;
    

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    

    @Test
    public void testSquareTask() {
        CalculationService service = new CalculationService(4);
        int expectedSquare = 16;
        when(calculationService.square(expectedSquare)).thenReturn(16);
        int actualSquare=service.square(4);
       // System.out.println("Expected "+expectedSquare+" actual: "+actualSquare);
        assertEquals(expectedSquare, actualSquare);
    }

    @Test
    public void testCubeTask() {
        CalculationService service = new CalculationService(4);
        int expectedCube = 64;
        when(calculationService.cube(4)).thenReturn(expectedCube);
        int actualCube = service.cube(4);
        assertEquals(expectedCube, actualCube);
    }

    @Test
    public void testEvenTask() {
        CalculationService service = new CalculationService(4);
        boolean expectResult = true;
        when(calculationService.isEven(4)).thenReturn(expectResult);
        boolean actualResult = service.isEven(4);
        assertEquals(expectResult,actualResult);
    }

    @Test
    public void testPrimeTask() {
        CalculationService service = new CalculationService(11);
        boolean expectResult = true;
        when(calculationService.isPrime(11)).thenReturn(expectResult);
        boolean actualResult = service.isPrime(11);
        assertEquals(expectResult,actualResult);
    }

    @Test
    public void testArmstrongTask() {
        CalculationService service = new CalculationService(121);
        boolean expectResult = false;
        when(calculationService.isArmstrong(121)).thenReturn(expectResult);
        boolean actualResult = service.isArmstrong(121);
        assertEquals(expectResult,actualResult);
    }

    @Test
    public void testPalindromeTask() {
        CalculationService service = new CalculationService(11);
        boolean expectResult = true;
        when(calculationService.isPalindrome(11)).thenReturn(expectResult);
        boolean actualResult = service.isPalindrome(11);
        assertEquals(expectResult,actualResult);
    }

    @Test
    public void testFactorialTask() {
        CalculationService service = new CalculationService(4);
        int expectResult=1;
        int expectedFactorial = 1;
        for (int i = 1; i <= 4; i++) {
            expectResult *= i;
        }
        when(calculationService.factorial(4)).thenReturn(expectResult);
        int actualResult = service.factorial(4);
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void testReverseTask() {
        CalculationService service = new CalculationService(4);
        int expectedReverse = 541;
        when(calculationService.reverse(145)).thenReturn(expectedReverse);
        int actualReverse = service.reverse(145);
        assertEquals(expectedReverse, actualReverse);
    }
}