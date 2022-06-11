package io.github.pjsmonteir0.DesafiosCodeWars.solucoes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class SquareDigitTest {

    @Mock
    SquareDigit squareDigit;

/**
 * It squares each digit in a number and returns the result.
 */
    @Test
    public void test() {
      assertEquals(811181, new SquareDigit().squareDigits(9119));
      assertEquals(0, new SquareDigit().squareDigits(0));
    }

/**
 * It generates 100 random numbers, squares each digit, and compares the result to the result of the
 * function being tested
 */
    @Test
    public void randomTest() {
      Random random = new Random();
      for (int i = 0; i < 100; i++) {
        int test = 0;
        test += random.nextInt(10);
        test += random.nextInt(10) * 10;
        test += random.nextInt(10) * 10 * 10;
        test += random.nextInt(10) * 10 * 10 * 10;
        
        assertEquals(new SquareDigit().squareDigits(test), new SquareDigit().squareDigits(test));
        
      }
    }
    
}
