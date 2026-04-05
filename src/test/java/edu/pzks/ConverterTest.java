package edu.pzks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void convert1ToRoman() {
        Assertions.assertEquals("I", Converter.convertToRoman(1));
    }

    @Test
    void convert2ToRoman() {
        Assertions.assertEquals("II", Converter.convertToRoman(2));
    }

    @Test
    void convert3ToRoman() {
        Assertions.assertEquals("III", Converter.convertToRoman(3));
    }

    @Test
    void convert4ToRoman() {
        Assertions.assertEquals("IV", Converter.convertToRoman(4));
    }

    @Test
    void convert5ToRoman() {
        Assertions.assertEquals("V", Converter.convertToRoman(5));
    }

    @Test
    void convert6ToRoman() {
        Assertions.assertEquals("VI", Converter.convertToRoman(6));
    }

    @Test
    void convert8ToRoman() {
        Assertions.assertEquals("VIII", Converter.convertToRoman(8));
    }

    @Test
    void convert9ToRoman() {
        Assertions.assertEquals("IX", Converter.convertToRoman(9));
    }

    @Test
    void convert10ToRoman() {
        Assertions.assertEquals("X", Converter.convertToRoman(10));
    }

    @Test
    void convert14ToRoman() {
        Assertions.assertEquals("XIV", Converter.convertToRoman(14));
    }

    @Test
    void convert19ToRoman() {
        Assertions.assertEquals("XIX", Converter.convertToRoman(19));
    }

    @Test
    void convert20ToRoman() {
        Assertions.assertEquals("XX", Converter.convertToRoman(20));
    }

    @Test
    void convert39ToRoman() {
        Assertions.assertEquals("XXXIX", Converter.convertToRoman(39));
    }

    @Test
    void convert40ToRoman() {
        Assertions.assertEquals("XL", Converter.convertToRoman(40));
    }

    @Test
    void convert44ToRoman() {
        Assertions.assertEquals("XLIV", Converter.convertToRoman(44));
    }

    @Test
    void convert50ToRoman() {
        Assertions.assertEquals("L", Converter.convertToRoman(50));
    }

    @Test
    void convert58ToRoman() {
        Assertions.assertEquals("LVIII", Converter.convertToRoman(58));
    }

    @Test
    void convert90ToRoman() {
        Assertions.assertEquals("XC", Converter.convertToRoman(90));
    }

    @Test
    void convert99ToRoman() {
        Assertions.assertEquals("XCIX", Converter.convertToRoman(99));
    }

    @Test
    void convert100ToRoman() {
        Assertions.assertEquals("C", Converter.convertToRoman(100));
    }

    @Test
    void convert400ToRoman() {
        Assertions.assertEquals("CD", Converter.convertToRoman(400));
    }

    @Test
    void convert500ToRoman() {
        Assertions.assertEquals("D", Converter.convertToRoman(500));
    }

    @Test
    void convert900ToRoman() {
        Assertions.assertEquals("CM", Converter.convertToRoman(900));
    }

    @Test
    void convert1000ToRoman() {
        Assertions.assertEquals("M", Converter.convertToRoman(1000));
    }

    @Test
    void convert1994ToRoman() {
        Assertions.assertEquals("MCMXCIV", Converter.convertToRoman(1994));
    }
}