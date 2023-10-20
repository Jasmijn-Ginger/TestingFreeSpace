import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.Math;

import static org.junit.Assert.*;


class WiskundeTest {

    Wiskunde wiskunde = new Wiskunde();
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void OptellenTest(){
        //Given
        int vb = 1 + 2;
        //When
        int result = wiskunde.Optellen(1, 2);
        //Then
        Assertions.assertEquals(result, vb);
    }

@Test
    void HoogsteGetalTest(){
        //Given
        double vb = Math.max(6,5.35);
        String xy = String.valueOf(vb);
        String yz = String.valueOf(Math.max(1953,2457.36));
        String x = "Equal";
        //When
        String result = wiskunde.HoogsteGetal(6,5.35);
        String result2 = wiskunde.HoogsteGetal(1953,2457.36);
        String result3 = wiskunde.HoogsteGetal(69,69);
        //Then
        Assertions.assertEquals(result, xy);
        Assertions.assertEquals(result2, yz);
        Assertions.assertEquals(result3, x);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15})
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        Assertions.assertTrue(wiskunde.isOdd(number));
    }



}