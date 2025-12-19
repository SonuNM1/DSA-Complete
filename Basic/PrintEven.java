package Basic;

// print all even numbers from 1 to n

public class PrintEven {
    public static void main(String[] args) {
        int num = 10 ; 

        for(int i=1 ; i <= num ; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}

// a number is even if (num % 2 == 0)
