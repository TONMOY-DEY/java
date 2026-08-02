
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Paste your paragraph:");

        String text = sc.nextLine();

        TextAnalyzer analyzer = new TextAnalyzer(text);

        System.out.println();

        System.out.println("Total Words : "
                + analyzer.getWordCount());

        System.out.println("Characters : "
                + analyzer.getCharacterCount());

        System.out.println("Without Space : "
                + analyzer.getCharacterWithoutSpace());

        System.out.println();

        String longest = analyzer.getLongestWord();

        System.out.println("Longest Word : "
                + longest);

        System.out.println("Length : "
                + longest.length());

        System.out.println("Estimated Memory : "
                + longest.length()*2 + " Bytes");

        System.out.printf("Average Length : %.2f\n",
                analyzer.getAverageLength());

        System.out.println();

        System.out.println("Longest Three Words");

        int i=1;

        for(String s : analyzer.getLongestThreeWords()){

            System.out.println(i+". "+s);

            i++;
        }

        System.out.println();

        System.out.println("Compression");

        System.out.println(longest);

        System.out.println("↓");

        System.out.println(Compression.compress(longest));

        System.out.println();

        System.out.println("Original Length : "
                + longest.length());

        System.out.println("Compressed Length : "
                + Compression.compress(longest).length());

        System.out.println("Saved : "
                + Compression.savedCharacters(longest));

        System.out.println();

        System.out.println("Total Estimated Memory : "
                + analyzer.getEstimatedMemory()+" Bytes");
    }

}

