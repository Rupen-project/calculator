package com.iiitb.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

class CalcOperations{

    private static final Logger logger = LogManager.getLogger(CalcOperations.class);
    public double add(double a,double b){
        double ans = a+b;
            logger.info("[ADDITION of "+a+" AND "+b+"][RESULT : "+ ans+"]");
        return ans;
    }

    public double subtract(double a,double b){
        double ans = a-b;
            logger.info("[SUBTRACTION of "+a+" AND "+b+"][RESULT : "+ ans+"]");
        return ans;
    }

    public double multiply(double a,double b){

        double ans = a*b;
            logger.info("[MULTIPLICATION of "+a+" AND "+b+"][RESULT : "+ ans+"]");
        return ans;

    }

    public double divide(double a,double b){

        double ans = a/b;
            logger.info("[DIVISION of "+a+" AND "+b+"][RESULT : "+ ans+"]");
        return ans;
    }

    public double squareRoot(double a){
        double ans = Math.sqrt(a);
            logger.info("[SQUARE ROOT of "+a+"][RESULT : "+ ans+"]");
        return ans;
    }

    public double factorial(int n){

        if(n<0)
            return Double.NaN;

        long ans = 1;
        while(n > 0){
            ans = ans*n;
            n--;
        }
            logger.info("[FACTORIAL of "+n+"][RESULT : "+ ans+"]");
        return ans;
    }

    public double naturalLog(double n){
        double ans = Math.log(n);
            logger.info("[NATURAL LOG of "+n+"][RESULT : "+ ans+"]");
        return ans;
    }

    public double power(double a,double b){
        double ans = Math.pow(a,b);
            logger.info("[POWER of "+a+" AND "+b+"][RESULT : "+ ans+"]");
        return ans;
    }
}
public class Calculator {



    public void run() {
        Scanner scanner = new Scanner(System.in);
        CalcOperations calcOperations = new CalcOperations();

        int op;
        double num1=0,num2=0;
        int ni=0;

        scanner.next().charAt(0);


        System.out.println("*********************** Calculator ***********************\n");


        while(true){
            try {


                System.out.print("****** Select Operations ******\n\n0 -> Exit\n1 -> Addition\n2 -> Subtraction\n3 -> Multiplication\n4 -> Division\n5 -> Square root\n6 -> Factorial\n7 -> Natural log\n8 -> Power\n\nSelect one of the operation no. : ");

                op = scanner.nextInt();

                if (op == 0) {
                    System.out.println("Bye Bye...\n");
                    System.out.println("Thank you for your time...\n");
                    System.out.println("RUPENKUMAR RAKHOLIYA ( MT2022093 ) \n");
                    break;
                }

                if(op == 5){
                    System.out.print("Provide any non-negative real number : ");
                    num1 = scanner.nextDouble();
                }else if(op == 6){
                    System.out.print("Provide any positive integer number in range (1-20) : ");
                    ni = scanner.nextInt();

                }else if(op == 7){
                    System.out.print("Provide any non-negative real number : ");
                    num1 = scanner.nextDouble();
                }
                else if(op>=1 && op<=8){
                    System.out.print("Provide 1st operand : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Provide 2nd operand : ");
                    num2 = scanner.nextDouble();
                }

                switch (op) {

                    case 1:
                        System.out.println(num1 + " + " + num2 + " is " + calcOperations.add(num1, num2) + "\n\n");
                        break;

                    case 2:
                        System.out.println(num1 + " - " + num2 + " is " + calcOperations.subtract(num1, num2) + "\n\n");
                        break;

                    case 3:
                        System.out.println(num1 + " * " + num2 + " is " + calcOperations.multiply(num1, num2) + "\n\n");
                        break;

                    case 4:
                        System.out.println(num1 + " / " + num2 + " is " + calcOperations.divide(num1, num2) + "\n\n");
                        break;
                    case 5:
                        System.out.println("sqrt("+num1+")"+" is " + calcOperations.squareRoot(num1) + "\n\n");
                        break;
                    case 6:
                        System.out.println(ni + "! is " +calcOperations.factorial(ni)+"\n\n");
                        break;
                    case 7:
                        System.out.println("ln("+num1+") is "+ calcOperations.naturalLog(num1)+"\n\n");
                        break;
                    case 8:
                        System.out.println("pow("+num1+","+num2+") is "+ calcOperations.power(num1,num2)+"\n\n");
                        break;
                    default:
                        System.out.println("Please provide correct operation no. from above list only");
                }
            }catch(Exception e){

                System.out.println("\n\n Something went wrong...please make sure you have entered correct inputs as asked\n\nE.g. \n-Don't enter -ve values for log operations\n-Only natural numbers are allowed for factorial ...etc\n\n");
                scanner.nextLine();
            }
        }
    }
}