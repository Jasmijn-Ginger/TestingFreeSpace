import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {

    CreateEssayTest createEssayTest = new CreateEssayTest();
    WordCounter wordCounter = new WordCounter();

    @Test
    void countWordsTest(){
        //Given
        int expectedOutcome = 6;
        //When
        String essay = "hallo, doei, en toen was er";
        int expectedResult = wordCounter.countWords(essay);
        //Then
        Assertions.assertEquals(expectedOutcome, expectedResult);
    }
}
