package CHAPTER_14_EXERCISES;

import java.security.SecureRandom;

public class SentenceGenerator {
    private static String[] article ={"a","the","some","one", "any"};
    private static String[] noun ={"dog","car","boy","girl", "town"};
    private static String[] verb ={"drove","jump","ran","walked", "skipped"};
    private static String[] preposition ={"to","from","over","under", "on"};

    public static String createSentence(){
        SecureRandom randomIndex = new SecureRandom();
        int index = randomIndex.nextInt(5);
        String firstWord = new String(article[index]);
        char firstLetter = firstWord.charAt(0);
        firstLetter= Character.toUpperCase(firstLetter);
        firstWord = firstWord.replace(firstWord.charAt(0), firstLetter);
        StringBuilder sentence = new StringBuilder(firstWord);
        sentence.append(" ");
        sentence.append(noun[index]);
        sentence.append(" ");
        sentence.append(verb[index]);
        sentence.append(" ");
        sentence.append(preposition[index]);
        sentence.append(" ");
        index =randomIndex.nextInt(5);
        sentence.append(article[index]);
        sentence.append(" ");
        sentence.append(noun[index]);
        return sentence.toString();

    }
}
