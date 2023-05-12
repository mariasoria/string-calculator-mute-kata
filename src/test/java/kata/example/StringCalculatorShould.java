package kata.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringCalculatorShould {

    @Test
    void handleEmptyStrings() {
        Assertions.assertEquals(StringCalculator.sum(""), 0);
    }

    @Test
    void handleOneNumber() {
        Assertions.assertEquals(StringCalculator.sum("1"), 1);
    }

    @Test
    void sumTwoNumbers() {
        Assertions.assertEquals(StringCalculator.sum("1,2"), 3);
    }

    @Test
    void handleSpacesAmongstNumbers() {
        Assertions.assertEquals(StringCalculator.sum("1,    2 "), 3);
    }

    @Test
    void handleNewLinesBetweenNumbers() {
        Assertions.assertEquals(StringCalculator.sum("1\\n2,3"), 6);
    }

    @Test
    void handleDelimitersBetweenNumbers() {
        Assertions.assertEquals(StringCalculator.sum("//;\n1;2"), 3);
    }

}