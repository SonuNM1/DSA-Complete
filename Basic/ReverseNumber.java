package Basic ;

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the number: ");
        int num = sc.nextInt() ; 

        int originalNum = num, reverse = 0; 

        while(num != 0){
            int lastDigit = num % 10 ; 
            reverse = reverse * 10 + lastDigit ; 
            num = num / 10 ; 
        }

        System.out.println("reverse: " + reverse);

    }
}