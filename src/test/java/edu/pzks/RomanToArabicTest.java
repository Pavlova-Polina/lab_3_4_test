package edu.pzks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToArabicTest {

    @Test
    void whenRomanI_ThenArabic1() {
        Assertions.assertEquals(1, Converter.romanToArabic("I"));
    }

    @Test
    void whenRomanIV_ThenArabic4() {
        Assertions.assertEquals(4, Converter.romanToArabic("IV"));
    }

    @Test
    void whenRomanIX_ThenArabic9() {
        Assertions.assertEquals(9, Converter.romanToArabic("IX"));
    }

    @Test
    void whenRomanLVIII_ThenArabic58() {
        Assertions.assertEquals(58, Converter.romanToArabic("LVIII"));
    }

    @Test
    void whenRomanXCIX_ThenArabic99() {
        Assertions.assertEquals(99, Converter.romanToArabic("XCIX"));
    }

    @Test
    void whenRomanMCMXCIV_ThenArabic1994() {
        Assertions.assertEquals(1994, Converter.romanToArabic("MCMXCIV"));
    }

    @Test
    void whenRomanIsNull_ThenThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Converter.romanToArabic(null));
    }

    @Test
    void whenRomanIsEmpty_ThenThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Converter.romanToArabic(""));
    }

    @Test
    void whenRomanContainsIncorrectSymbol_ThenThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Converter.romanToArabic("ABC"));
    }

    @Test
    void whenRomanIsInvalid_ThenThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Converter.romanToArabic("IIII"));
    }
}