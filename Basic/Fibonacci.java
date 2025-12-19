package Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt() ; 

        int a = 0, b = 1; 

        for(int i = 3; i <= n ; i++){
            int c = a + b ; 
            System.out.print(c + " ");
            a = b ; 
            b = c ;
        }
        sc.close() ;
    }
}


/*  fibonacci = first two numbers 0 and 1, Next = previous two number sum

0 1 1 2 3 5 8 13 

First 2 numbers are fixed -> 0 and 1. Loop starts from 3rd term. 

New term = previous + second previous 
*/