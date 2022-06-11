package io.github.pjsmonteir0.DesafiosCodeWars.solucoes;

import java.util.*; 

public class SquareDigit {

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
