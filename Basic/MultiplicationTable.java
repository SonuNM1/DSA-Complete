package Basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter num: ");
        int num = sc.nextInt() ; 

        int multiple = 1 ; 

        for(int i = 1 ; i <= num ; i++){
            multiple = multiple * i ; // 1
        }

        System.out.println("multiple: " +  multiple);

    }
}
