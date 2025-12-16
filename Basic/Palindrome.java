package Basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter a number: ");

        int num = sc.nextInt() ; // 121

        int originalNum = num, reverse = 0 ; 

        while(num != 0){
            int lastDigit = num % 10 ; 
            reverse = reverse * 10 + lastDigit ; 
            num = num / 10 ; 
        }

        if(reverse == originalNum){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
