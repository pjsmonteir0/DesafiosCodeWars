package io.github.pjsmonteir0.DesafiosCodeWars.solucoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Random;
import org.mockito.Mock;

/**
 * This class tests the ParityOutlier class
 */
public class ParityOutlierTest {
    
    @Mock
    SquareDigit squareDigit;

    /**
     * It creates a bunch of arrays with different numbers of odd and even numbers, and then tests to
     * see if the function returns the correct answer
     */
    public void test() {
        /* Basic tests */
        
        
             int[] ints1 = {2,6,8,10,3}; //odd at the back
             int[] ints2 = {2,6,8,200,700,1,84,10,4}; //odd in the middle
             int[] ints3 = {17,6,8,10,6,12,24,36}; //odd in the front
             int[] ints4 = {2,1,7,17,19,211,7}; //even in the front
             int[] ints5 = {1,1,1,1,1,44,7,7,7,7,7,7,7,7}; //even in the middle
             int[] ints6 = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,35,5,5,5,5,5,5,5,5,5,5,7,7,7,7,1000}; //even at the end
             int[] ints7 = {2,-6,8,-10,-3}; //odd at the back, negative
             int[] ints8 = {2,6,8,2,-66,34,-35,66,700,1002,-84,10,4}; //odd in the middle, negative
             int[] ints9 = {-1* Integer.MAX_VALUE,-18,6,-8,-10,6,12,-24,36}; //odd in the front, negative
             int[] ints10 = {-20,1,7,17,19,211,7}; //even in the front, negative
             int[] ints11= {1,1,-1,1,1,-44,7,7,7,7,7,7,7,7}; //even in the middle, negative
             int[] ints12 = {1,0,0}; //odd answer, zeroes
             int[] ints13 = {3,7,-99,81,90211,0,7}; //even in the middle, zero
             
             assertEquals(3, ParityOutlier.find(ints1));
             assertEquals(1, ParityOutlier.find(ints2));
             assertEquals(17, ParityOutlier.find(ints3));
             assertEquals(2, ParityOutlier.find(ints4));
             assertEquals(44, ParityOutlier.find(ints5));
             assertEquals(1000, ParityOutlier.find(ints6));
             assertEquals(-3, ParityOutlier.find(ints7));
             assertEquals(-35, ParityOutlier.find(ints8));
             assertEquals(-1 * Integer.MAX_VALUE, ParityOutlier.find(ints9));
             assertEquals(-20, ParityOutlier.find(ints10));
             assertEquals(-44, ParityOutlier.find(ints11));
             assertEquals(1, ParityOutlier.find(ints12));
             assertEquals(0, ParityOutlier.find(ints13));
            // Random tests
             Random r = new Random();
             int positionA = r.nextInt(400);
             int positionB = r.nextInt(400);
             int[] randomOdds = new int[400];
             int[] randomEvens = new int[400];
             int evenSample = r.nextInt(3000) * 2;
             int oddSample = r.nextInt(3000) * 2 + 1;
             for (int i = 0; i < 400; i++) {
               randomOdds[i] = r.nextInt(3000) * 2 + 1;
              }
              for (int i = 0; i < 400; i++) {
               randomEvens[i] = r.nextInt(3000) * 2;
              }
             randomOdds[positionA] = evenSample;
             randomEvens[positionB] = oddSample;
             
             assertEquals(evenSample, ParityOutlier.find(randomOdds));
             assertEquals(oddSample, ParityOutlier.find(randomEvens));
             //large array test
             int positionC = r.nextInt(10000000);
             int positionD = r.nextInt(10000000);
             int[] bigOddArray = new int[10000000];
             int[] bigEvenArray = new int[10000000];
             for (int i = 0; i < 10000000; i++) {
             bigOddArray[i] = r.nextInt(100000) * 2 + 1;
             bigEvenArray[i] = r.nextInt(100000) * 2;
             }
             bigOddArray[positionC] = evenSample;
             bigEvenArray[positionD] = oddSample;
             assertEquals(evenSample, ParityOutlier.find(bigOddArray));
             assertEquals(oddSample, ParityOutlier.find(bigEvenArray));
        }
    }