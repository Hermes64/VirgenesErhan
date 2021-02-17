package KEA;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Square {

    char[] alphabetKey = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] alphabetValue = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private HashMap<Character, Character> map;

    public Square() {
        map = new HashMap<Character, Character>();
    }

    public Map<Character, Character> buildSquare() {

        for (int i = 0; i < alphabetKey.length; i++) {

            for (int j = 0; j < alphabetValue.length; j++) {

                map.put(Character.charCount());
//                System.out.println( alphabetKey [i]);


            }

        }
        return null;
    }
}







    //    public static Map<Character, Character> createSquare() {
////        HashMap<Character, Character> alphabet = new HashMap<Character, Character>();
////        String string = "abcdefghijklmnopqrstuvwxyz";
////        String[] split = string.split(",");
////
////        System.out.println(split);
//    }

}
