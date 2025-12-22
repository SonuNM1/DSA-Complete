package Basic;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ; // 36
        int n2 = sc.nextInt() ; // 24 

        while(n1 % n2 != 0){
            int rem = n1 % n2 ; // 12
            n1 = n2 ; 
            n2 = rem ; 
        }
        int gcd = n2 ; 
    }    
}

/*
GCD (Greatest Common Divisor): the largest number that divides both numbers completely

    a = 36, b = 24
    Common divisors -> 1, 2, 3, 4, 6, 12
    GCD = 12 

    divisor, dividend, remainder

*/