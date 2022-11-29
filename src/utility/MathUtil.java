/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author Umman
 */
public class MathUtil
{

    public static void find(int value, int divideBy) {// her hansi bir edede qaliqsiz bolunme
        for (int i = 0; i <= value; i++) {
            if (i % divideBy == 0) {
                System.out.println(i);
            }
        }
    }

    public static void findBy2(int value) {// cox istifadeolunan edede qaliqsiz bolunme
        find(value, 2);

    }

    public static void sadeEdedlerVerilenAraliqda(int value) {
        int i, j, isPrime;

        for (i = 2; i <= value; i++) {// i = 0 olarsa asagidaki kodu komentden cixarmaq lazimdir
//            if (i == 0 || i == 1) {
//                continue;
//            }
            isPrime = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1) {
                System.out.println(i);
            }
        }

    }
}
