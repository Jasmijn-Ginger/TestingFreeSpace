import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZelfTest {

    Zelf zelf = new Zelf();

    @Test
    void RandomNummerTest(){
        //Given
        int nummer = 10;
        //When
        int expectedResult = zelf.RandomNummer();
        //Then
        Assertions.assertEquals(nummer, expectedResult);

    }

    @Test
    void JaOfNeeTest(){
        //When
        boolean resultTrue = zelf.JaOfNee("a");
        boolean resultFalse = zelf.JaOfNee("b");
        //Then
        Assertions.assertTrue(resultTrue);
        Assertions.assertFalse(resultFalse);

    }

    @Test
    void SquareTest(){
        //Given
        int nummer1 = 9;
        int nummer2 = 64;
        //When
        int result1 = zelf.Square(3);
        int result2 = zelf.Square(8);
        //Then
        Assertions.assertEquals(nummer1, result1);
        Assertions.assertEquals(nummer2, result2);
        Assertions.assertNotEquals(nummer1, result2);
    }

    @Test
    void WoordAchterStevoren(){
        //Given
        String achterstevoren = "ollaH";
        //When
        String result = zelf.WoordFlip("Hallo");
        //Then
        Assertions.assertEquals(achterstevoren, result);
    }

    @Test
    void NummerFlipTest(){
        //Given
        String achterstevoren = "563";
        zelf.result = "365";
        //When
        String result0 = zelf.NummerFlip();
        //Then
        Assertions.assertEquals(achterstevoren, result0);
    }
}
