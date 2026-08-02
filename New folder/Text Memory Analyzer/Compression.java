import java.util.*;
public class Compression {

    public static String compress(String word){

        if(word.length()<=10)
            return word;

        return "" + word.charAt(0)
                + (word.length()-2)
                + word.charAt(word.length()-1);
    }

    public static int savedCharacters(String word){

        return word.length()-compress(word).length();
    }

}
    

