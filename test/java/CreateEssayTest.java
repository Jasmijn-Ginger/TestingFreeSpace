import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateEssayTest {

    CreateEssay createEssay = new CreateEssay();
    String[] vblistWords = {"hello", "hallo", "welkom", "test", "Senna"};
    String expectedResult = createEssay.writeEssay(2, vblistWords);

    @Test
    void RandomIntTest() {
        int expectedResult = createEssay.randomInt();
        boolean shouldbetrue = expectedResult > 0 && expectedResult<createEssay.listWords().length;
        Assertions.assertTrue(shouldbetrue);
    }

    @Test
    void ListWordsTest() {
        Assertions.assertTrue(String.join(" ", createEssay.listWords()).contains("Adequate"));

    }

    @Test
    void WriteEssayTest() {
        Assertions.assertFalse(createEssay.writeEssay(3, vblistWords).isEmpty());


    }
}

