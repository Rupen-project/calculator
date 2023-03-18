package com.iiitb.calculator;

import java.util.Scanner;


public class Calculator {


    public int add(int a, int b){
        return a+b;
    }
    public void run() {
        int num1, num2, num3;
        boolean flag = true;
        char choice;
        Scanner scan = new Scanner(System.in);
        while(flag){
            try{
                System.out.println("Enter your two integers(space separated)");
                num1 = scan.nextInt();
                num2 = scan.nextInt();
                num3 = add(num1,num2);
                System.out.println(num3);
                System.out.println("You wanna continue (Y/N) ? : ");
                choice = scan.next().charAt(0);
                if(choice!='Y'){
                    flag = false;
                }
            }
            catch(Exception e){
                System.out.println(e);
                return;
            }
        }
    }
}