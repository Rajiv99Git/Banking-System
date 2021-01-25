/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two value");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Addition :"+(a+b));
     }
}
