package Basic ;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {

        boolean isPrime = true ; 

        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter no to check whether prime or not: ");
        int num = sc.nextInt() ; 

        if(num <= 1) isPrime = false ; 

        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
                isPrime = false ; 
                break ; 
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}