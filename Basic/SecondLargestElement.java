package Basic ; 

public class SecondLargestElement{
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5} ; 

        int largest = arr[arr.length-1]; 
        int largestIndex = 0 ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i] ; 
                largestIndex = i ; 
            }
        }

    }
}

// sorted and unsorted array 