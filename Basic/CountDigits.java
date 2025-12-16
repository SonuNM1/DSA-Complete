package Basic ;

import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the number: ");
        int num = sc.nextInt() ; // 123

        int count = 0 ; 

        if(num == 0){
            count = 1 ; 
        } else {
            while (num != 0){
                num = num / 10 ; // 12 , 1
                count ++ ;
            }
        }
        System.out.println("Count: " + count);
    }
}