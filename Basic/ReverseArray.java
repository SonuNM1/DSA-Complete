package Basic;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter length of array: ");

        int length = sc.nextInt() ; 

        System.out.println("Enter array elements: ");

        int[] arr = new int[length] ; 

        for(int i=0 ; i < length ; i++){
            arr[i] = sc.nextInt() ; 
        }

        System.out.println("Array in original order");

        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray in reverse order: ");

        for(int i=arr.length-1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
