package Basic;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurenceEveryElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter length of array: "); 
        int n = sc.nextInt() ;
        
        int[] arr = new int[n] ; 

        System.out.println("Enter the elements: ");

        for(int i=0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt() ; 
        }

        HashMap<Integer, Integer> map = new HashMap<>() ; 

        // counting occurrences 

        for(int el : arr){
            map.put(el, map.getOrDefault(el, 0) + 1) ; 
        }

        // display result 

        for(int element: map.keySet()){
            System.out.println(element + " : " + map.get(element));
        }

    }
}

