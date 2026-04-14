package practice_set9;
import java.util.*;

public class frequency_of_word {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        String[] words = str.split("\\s+"); 

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if(frequencyMap.containsKey(word)){
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        System.out.println("Frequency of each word:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
