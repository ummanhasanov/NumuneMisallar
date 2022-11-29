/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numunemisallar;

import utility.MathUtil;
import java.util.Scanner;

/**
 *
 * @author Umman
 */
public class Tapshiriqlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int value = sc.nextInt();
        MathUtil.sadeEdedlerVerilenAraliqda(value);
    }

}
