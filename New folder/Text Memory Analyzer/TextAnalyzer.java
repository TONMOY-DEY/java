
import java.util.*;

public class TextAnalyzer {

    private String text;

    public TextAnalyzer(String text) {
        this.text = text.trim();
    }

    public int getWordCount() {

        if(text.isEmpty())
            return 0;

        return text.split("s+").length;
    }

    public int getCharacterCount() {

        return text.length();
    }

    public int getCharacterWithoutSpace() {

        return text.replaceAll("s+","").length();
    }

    public String getLongestWord() {

        String words[] = text.split("s+");

        String longest = "";

        for(String w : words){

            if(w.length() > longest.length())
                longest = w;
        }

        return longest;
    }

    public double getAverageLength(){

        String words[] = text.split("s+");

        int total = 0;

        for(String w : words)
            total += w.length();

        return (double)total / words.length;
    }

    public long getEstimatedMemory(){

        return (long)getCharacterCount()*2;
    }

    public List<String> getLongestThreeWords(){

        String words[] = text.split("s+");

        List<String> list = new ArrayList<>(Arrays.asList(words));

        list.sort((a,b)->b.length()-a.length());

        if(list.size()>3)
            return list.subList(0,3);

        return list;
    }

}
    

