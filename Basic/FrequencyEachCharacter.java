package Basic;

import java.util.HashMap;

// WAP frequency of each character of string - HashMap 

public class FrequencyEachCharacter {
    public static void main(String[] args) {
        String str = "Sonu NM" ; 

        HashMap<Character, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < str.length() ; i++){
            char ch = str.charAt(i) ; 

            // if character already exists, increase count 

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1) ; 
            } else {
                map.put(ch, 1) ; 
            }
        }

        System.out.println("Character frequencies: ");

        for(char key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

    }
}


