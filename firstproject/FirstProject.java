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
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operation: ");
        int op = sc.nextInt();
        
        int result = 0;
        
        if(op == 1) {
            result = a + b;
        } else if (op == 2) {
            result = a - b;
        } else if (op == 3) {
            result = a / b;
        } else if (op == 4) {
            result = a % b;
        } else {
            System.out.println("Type again");
        }
        
        System.out.println(result);
        
    }
}
