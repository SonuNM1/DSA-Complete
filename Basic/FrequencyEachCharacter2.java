package Basic;

// WAP to count characters in a string - without HashMap. Works because characters are internally stored as numbers (ASCII)

public class FrequencyEachCharacter2 {
    public static void main(String[] args) {
        String name = "Sonu NM" ; 
        int[] arr = new int[256] ; // ASCII size 

        // Count frequency 

        for(int i=0 ; i < name.length() ; i++){
            char ch = name.charAt(i) ; 

            // ignoring spaces 

            if(ch == ' '){
                continue; 
            }

            // making characters case-insenstive 

            ch = Character.toLowerCase(ch) ; 

            arr[ch]++ ; 
        }

        System.out.println("Character frequencies: ");

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                System.out.println((char)i + " : " + arr[i]);
            }
        }

    }
}
