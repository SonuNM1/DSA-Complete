package Basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153 ; 
        int count = 0 ; 

        int temp = num, originalNum = num ; 
        int sum = 0 ; 

        // counting the number of digits in a number 

        while (num > 0){
            num = num / 10 ; 
            count ++ ;
        }

        // calculating sum of digits raised to power 'digits'        

        while(temp > 0){
            int lastDigit = temp % 10 ; 
            sum += Math.pow(lastDigit, count) ; 
            temp = temp / 10 ; 
        }

        if(originalNum == sum){
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number");
        }

    }
}

/*
 * Armstrong Number: count digits, raise each digit to power of digits , sum
 * them. if sum == original, Armstrong
 * 
 * Armstrong number is a number that is equal to the sum of its own digits
 * raised to the power of the number of digits.
 * 
 * Number - 153 (3 digits)
 * 
 * 13+53+33=1+125+27=153
 * 
 * Result = Original number
 * Armstrong number
 * 
 */
