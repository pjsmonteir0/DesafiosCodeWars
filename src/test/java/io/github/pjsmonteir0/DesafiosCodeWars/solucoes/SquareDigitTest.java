package io.github.pjsmonteir0.DesafiosCodeWars.solucoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SquareDigitTest {

/**
 * It squares each digit in a number and returns the result.
 */
    @Test
    public void test() {
      assertEquals(811181, new SquareDigit().squareDigits(9119));
      assertEquals(0, new SquareDigit().squareDigits(0));
    }
    
}
