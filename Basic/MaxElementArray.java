package Basic;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4} ; 

        int maxElement = arr[0] ; // 1

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] > maxElement){
                maxElement = arr[i] ; 
            }
        }
        System.out.println("Max element: " + maxElement);
    }
}
