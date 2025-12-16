package Basic;

public class LargestOfTwoNum {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3; 

        int large = 0 ; 

        if(num1 > num2){
            large = num1 ; 
        } else {
            large = num2 ; 
        }

        System.out.println("large: " + large);
    }
}
