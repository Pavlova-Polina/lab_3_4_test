package edu.pzks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   lab_3_4_test
  @class  ConverterTest
  @version  1.0.0 
  @since 10.03.25 - 14.05
*/

class ConverterTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void whenArabic_3_ThenRoman_III() {
        Assertions.assertEquals("III", Converter.convertToRoman(3));
    }
    @Test
        void whenArabic_5_ThenRoman_V() {
        Assertions.assertEquals("V", Converter.convertToRoman(5));
    }

    @Test
        void whenArabic_4_ThenRoman_IV() {
        Assertions.assertEquals("IV", Converter.convertToRoman(4));
    }

    @Test
        void whenArabic_8_ThenRoman_VIII() {
        Assertions.assertEquals("VIII", Converter.convertToRoman(8));
    }
    @Test
        void whenArabic_10_ThenRoman_X() {
        Assertions.assertEquals("X", Converter.convertToRoman(10));
    }


    /*
    *   1 - I
    *   2 - II
    *   3 - III
    *   4 - IV
    *   5 - V
    *   6 - VI
    *
    * 9   -  IX
    * 10 - X
    * 11  - XI
    *
    *  15
    * 18
    * 20
    * 28
    *
    * 40
    * 48
    *
    * 50
    * 58
    * 88
    * 108
    * 98
    *
    *
    * */
}
