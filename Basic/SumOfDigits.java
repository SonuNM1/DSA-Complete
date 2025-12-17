package Basic;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter number: ");

        int num = sc.nextInt() ; // 123 

        int sum = 0 ; 

        while(num != 0){
            int lastDigit = num % 10 ; // 3
            num = num / 10 ; 
            sum += lastDigit ;  
        }
        System.out.println("Sum: " + sum);
    }
}
