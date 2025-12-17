package Basic;

// find minimum and maximum element in the array 

public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5} ; 

        int minElement = arr[0] ; 
        int maxElement = arr[arr.length-1] ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] < minElement){
                minElement = arr[i] ; 
            } else {
                maxElement = arr[i] ; 
            }
        }

        System.out.println("Min element: " + minElement);
        System.out.println("Max element: " + maxElement);
    }
}
