package CHAPTER_14_EXERCISES;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSentence() {
        for (int i = 0;i<20;i++) {
            String sentence = SentenceGenerator.createSentence();
            assertFalse(sentence.isEmpty());
            System.out.println(sentence);
        }
    }
}