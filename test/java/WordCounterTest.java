import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {

    CreateEssayTest createEssayTest = new CreateEssayTest();
    WordCounter wordCounter = new WordCounter();

    @Test
    void countWordsTest(){
        //Given
        int expectedOutput = 2;
        //When
        int expectedResult = wordCounter.countWords(createEssayTest.expectedResult);
        //Then
        Assertions.assertEquals(expectedOutput, expectedResult);
    }
}
