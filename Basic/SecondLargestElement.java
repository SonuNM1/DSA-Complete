package Basic ; 

public class SecondLargestElement{
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7} ; 

        int largest = Integer.MIN_VALUE ;
        int secondLargest = Integer.MIN_VALUE ; 

        for(int i=0 ; i < arr.length ; i++){

            // Case 1: New largest found 

            if(arr[i] > largest){
                secondLargest = largest ; 
                largest = arr[i] ; 
            }

            // Case 2: Between largest and secondLargest 

            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i] ; 
            }
        }

        System.out.print("Second largest: " + secondLargest);

    }
}

// sorted and unsorted arrary

/*
UNSORTED ARRAY - SECOND LARGEST ELEMENT IN ARRAY 

For every element in the array:

Case 1: Current element > largest 

    The old largest becomes the second largest 
    
    Current element becomes the new largest 

Case 2: Current element < largest BUT > secondLargest 

    Update only secondLargest
*/