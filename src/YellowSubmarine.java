import java.util.*;

public class YellowSubmarine {

    public static void main(String[] args) {
        YellowSubmarine o = new YellowSubmarine();
        o.getMostOccuredWordInSentence("");
    }



    private void getMostOccuredWordInSentence (String sentence) {
        String[] splitedSentence = sentence.split(" ");

        Map<String, Integer> words = new HashMap<>();
        for (String word: splitedSentence) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
        if (!words.isEmpty()) {
            String key = Collections.max(words.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println("The most occurred word is: " + key);
        } else {
            System.out.println("Please enter a non-empty sentence");
        }
    }
}
