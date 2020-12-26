//Write a program that performs integer divisions. The user enters two numbers through console. 
//If Num1 or Num2 were not an integer, the program would throw Number Format Exception. 
//If Num2 were Zero, the program would throw an Arithmetic Exception. Try using keywords try, catch, throw, throws and finally

import java.util.*;

public class exception7 {
    int a, b;

    void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Num1");
        try {
            a = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Only integers are allowed");
            throw e;
        }
        System.out.println("Enter the value of Num2");
        try {
            b = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Only integers are allowed");
            throw e;
        }
    }

    void divide() {
        try {
            if (b == 0)
                throw new ArithmeticException();
            System.out.println(a + "/" + b + " is " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Num2 cannot be zero");
            throw e;
        }
    }

    public static void main(String args[]) throws InputMismatchException, ArithmeticException {
        exception7 ob = new exception7();
        try {
            ob.getInput();
            ob.divide();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("----Final----");
        }
    }
}