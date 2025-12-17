package Basic;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 4} ; 
        boolean flag = false ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] < arr[i+1]){
                flag = true ; 
                break; 
            }
        }

        if(flag == true){
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }
    }
}
