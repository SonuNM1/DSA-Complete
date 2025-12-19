package Basic;

public class Armstrong {
    public static void main(String[] args) {
        int num = 123 ; 

        int count = 0 ; 

        if(num <= 1){
            count = 1 ; 
        } else {
            while(num != 0){
                int lastDigit = num % 10 ; 
                num = num / 10 ; 
                count++ ; 
            }
        }
    }   
}


/*
Armstrong Number: count digits, raise each digit to power of digits , sum them 

if sum == original, Armstrong 
*/