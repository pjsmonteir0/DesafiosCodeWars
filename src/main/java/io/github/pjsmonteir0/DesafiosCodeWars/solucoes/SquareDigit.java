package io.github.pjsmonteir0.DesafiosCodeWars.solucoes;

import java.util.*; 

/**
 * Bem-vindo. Neste kata, você é solicitado a elevar ao quadrado 
 * cada dígito de um número e concatená-los.
Por exemplo, se executarmos 9119 através da função, 811181 sairá,
porque 92 é 81 e 12 é 1.
Nota: A função aceita um inteiro e retorna um inteiro
 */
public class SquareDigit {

    /**
     * It takes an integer and squares each digit in the integer.
     * 
     * @param n the number to be squared
     * @return The square of each digit in the number.
     */
    public int squareDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        List<Integer> listInt = new ArrayList(); 
            for(int i = 0; i < digits.length ; i++) {
              int x = Character.digit(digits[i], 10);
              listInt.add(x*x);
            }
        String str = "";
            for(int i = 0; i < listInt.size(); i++) {
              str = str + listInt.get(i);
            }
        return Integer.parseInt(str);
      }
}
