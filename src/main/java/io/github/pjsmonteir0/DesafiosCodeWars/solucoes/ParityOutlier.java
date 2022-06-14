package io.github.pjsmonteir0.DesafiosCodeWars.solucoes;

/**
Você recebe um array (que terá um comprimento de pelo menos 3,
mas pode ser muito grande) contendo inteiros. A matriz é 
inteiramente composta de inteiros ímpares ou inteiramente 
composta de inteiros pares, exceto por um único inteiro N. 
Escreva um método que receba a matriz como um argumento e 
retorne esse N unico.
 */
public class ParityOutlier {

        public static int find (int[] integers) {
          int parContador = 0;
          int imparContador = 0;
          int par = 0;
          int impar = 0;
          for (int integer : integers) {
            if (integer % 2 == 0) {
              par = integer;
              parContador++;
            } else {
              impar = integer;
              imparContador++;
            }
          }
          if ((parContador > 1) && (imparContador == 1)) {
            return impar;
          } else if ((imparContador > 1) && (parContador == 1)) {
            return par;
          } else {
            return 0;
          }
      }
    }