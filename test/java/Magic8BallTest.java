import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

class Magic8BallTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }


    Magic8Ball magic8Ball = new Magic8Ball();



    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        magic8Ball.print("Hello Baeldung Readers!!");
        Assertions.assertEquals("Hello Baeldung Readers!!", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void testthingy() {
        //When
        magic8Ball.output(3);
        //Then
        Assertions.assertEquals("Zou zo maar kunnen", outputStreamCaptor.toString().trim());
    }

    private static Stream<Arguments> inputsAndResults() {
        return Stream.of(
                Arguments.of(1, "Ja gaat zeker lukken"),
                Arguments.of(2, "Misschien")
        );
    }

    @ParameterizedTest
    @MethodSource("inputsAndResults")
    void convert(int input, String expectedResult) {
        Assertions.assertEquals(expectedResult, magic8Ball.output2(input));
    }

}
