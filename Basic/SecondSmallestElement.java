package Basic;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 3} ; // 2

        int smallest = Integer.MAX_VALUE ; 
        int secondSmallest = Integer.MAX_VALUE ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest ; 
                smallest = arr[i] ; 
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i] ; 
            }
        }

        System.out.println("Second smallest: " + secondSmallest);

    }
}

/*
For every element in the array:

Case 1: New smallest found 

    Old smallest becomes the second smallest. 

    Current element becomes smallest 

Case 2: Element is bigger than smallest but smaller than second smallest 

    Update only second smallest 

*/