package Basic;

public class Factorial {
    public static void main(String[] args) {
        int num = 4 ; // 24 

        int factorial = 1 ; 

        for(int i=1; i <= 4 ; i++){
            factorial = factorial * i ; 
        }

        System.out.print("Factorial of: " + num + " is: " + factorial);

    }
}
