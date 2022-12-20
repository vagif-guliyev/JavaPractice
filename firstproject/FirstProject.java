/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.firstproject;

import java.util.Scanner;

/**
 *
 * @author vaqifquliyev
 */
public class FirstProject {

    public static void main(String[] args) {

        /*
        1: 4 bos 1 *
        2: 3 bos 2 *
        3: 2 bos 3 *
        4: 1 bos 4 *
        5: 0 bos 5 *
        */
        
        for (int i=0; i<5; i++) {
            for (int j=0; j<4-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
