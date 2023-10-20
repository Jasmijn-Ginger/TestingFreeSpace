import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;

import java.util.stream.Stream;


 class FizzBuzzTest {

    private static Stream<Arguments> inputsAndResults() {


        return Stream.of(
                Arguments.of(-1, "N/A"),
                Arguments.of(0, "N/A"),
                Arguments.of(1001, "N/A"),
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(3, "Fizz"),
                Arguments.of(4, "4"),
                Arguments.of(5, "Buzz"),
                Arguments.of(6, "Fizz"),
                Arguments.of(10, "Buzz"),
                Arguments.of(15, "FizzBuzz"),
                Arguments.of(30, "FizzBuzz"),
                Arguments.of(33, "Fizz"),
                Arguments.of(45, "FizzBuzz")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void convert(int input, String expectedResult) {
        var sut = new FizzBuzz();
        Assertions.assertEquals(expectedResult, sut.convert(input));
    }
}
