package Basic;

import java.util.Scanner;

public class SumNNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter num: ");
        int num = sc.nextInt() ; 

        int sum = 0 ; 

        for(int i=1 ; i <= num ; i++){
            sum = sum + i ; 
        }

        System.out.println("Sum: " + sum);
    }
}

// sum of n natural numbers 
