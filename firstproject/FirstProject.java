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

        for (int i=0; i<4; i++) {
            for (int j=0; j<8; j++) {
                if (j==3 || j==4) {
                    System.out.print(" ");
                } else {
                    System.out.print("=");
                }
               }
            System.out.println("");
        }

    }
}
