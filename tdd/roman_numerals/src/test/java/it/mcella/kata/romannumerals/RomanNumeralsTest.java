package it.mcella.kata.romannumerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void shouldConvertNumber1ToI() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(1);

        assertThat(numeral, is("I"));
    }

    @Test
    public void shouldConvertNumber3ToIII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(3);

        assertThat(numeral, is("III"));
    }

    @Test
    public void shouldConvertNumber4ToIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(4);

        assertThat(numeral, is("IV"));
    }

    @Test
    public void shouldConvertNumber8ToVIII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(8);

        assertThat(numeral, is("VIII"));
    }

    @Test
    public void shouldConvertNumber9ToIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(9);

        assertThat(numeral, is("IX"));
    }

    @Test
    public void shouldConvertNumber10ToX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(10);

        assertThat(numeral, is("X"));
    }

    @Test
    public void shouldConvertNumber12ToXII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(12);

        assertThat(numeral, is("XII"));
    }

    @Test
    public void shouldConvertNumber14ToXIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(14);

        assertThat(numeral, is("XIV"));
    }

    @Test
    public void shouldConvertNumber15ToXV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(15);

        assertThat(numeral, is("XV"));
    }

    @Test
    public void shouldConvertNumber18ToXVIII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(18);

        assertThat(numeral, is("XVIII"));
    }

    @Test
    public void shouldConvertNumber19ToXIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(19);

        assertThat(numeral, is("XIX"));
    }

    @Test
    public void shouldConvertNumber20ToXX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(20);

        assertThat(numeral, is("XX"));
    }

    @Test
    public void shouldConvertNumber23ToXXIII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(23);

        assertThat(numeral, is("XXIII"));
    }

    @Test
    public void shouldConvertNumber35ToXXXV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(35);

        assertThat(numeral, is("XXXV"));
    }

    @Test
    public void shouldConvertNumber39ToXXXIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(39);

        assertThat(numeral, is("XXXIX"));
    }

    @Test
    public void shouldConvertNumber40ToXL() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(40);

        assertThat(numeral, is("XL"));
    }

    @Test
    public void shouldConvertNumber45ToXLV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(45);

        assertThat(numeral, is("XLV"));
    }

    @Test
    public void shouldConvertNumber46ToXLVI() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(46);

        assertThat(numeral, is("XLVI"));
    }

    @Test
    public void shouldConvertNumber49ToXLIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(49);

        assertThat(numeral, is("XLIX"));
    }

    @Test
    public void shouldConvertNumber50ToL() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(50);

        assertThat(numeral, is("L"));
    }

    @Test
    public void shouldConvertNumber54ToLIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(54);

        assertThat(numeral, is("LIV"));
    }

    @Test
    public void shouldConvertNumber60ToLX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(60);

        assertThat(numeral, is("LX"));
    }

    @Test
    public void shouldConvertNumber75ToLXXV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(75);

        assertThat(numeral, is("LXXV"));
    }

    @Test
    public void shouldConvertNumber88ToLXXXVIII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(88);

        assertThat(numeral, is("LXXXVIII"));
    }

    @Test
    public void shouldConvertNumber90ToXC() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(90);

        assertThat(numeral, is("XC"));
    }

    @Test
    public void shouldConvertNumber96ToXCVI() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(96);

        assertThat(numeral, is("XCVI"));
    }

    @Test
    public void shouldConvertNumber99ToXCIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(99);

        assertThat(numeral, is("XCIX"));
    }

    @Test
    public void shouldConvertNumber100ToC() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(100);

        assertThat(numeral, is("C"));
    }

    @Test
    public void shouldConvertNumber102ToCII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(102);

        assertThat(numeral, is("CII"));
    }

    @Test
    public void shouldConvertNumber144ToCXLIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(144);

        assertThat(numeral, is("CXLIV"));
    }

    @Test
    public void shouldConvertNumber189ToCLXXXIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(189);

        assertThat(numeral, is("CLXXXIX"));
    }

    @Test
    public void shouldConvertNumber194ToCXCIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(194);

        assertThat(numeral, is("CXCIV"));
    }

    @Test
    public void shouldConvertNumber199ToCXCIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(199);

        assertThat(numeral, is("CXCIX"));
    }

    @Test
    public void shouldConvertNumber444ToCDXLIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(444);

        assertThat(numeral, is("CDXLIV"));
    }

    @Test
    public void shouldConvertNumber499ToCDXCIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(499);

        assertThat(numeral, is("CDXCIX"));
    }

    @Test
    public void shouldConvertNumber509ToDIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(509);

        assertThat(numeral, is("DIX"));
    }

    @Test
    public void shouldConvertNumber544ToDXLIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(544);

        assertThat(numeral, is("DXLIV"));
    }

    @Test
    public void shouldConvertNumber597ToDXCVII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(597);

        assertThat(numeral, is("DXCVII"));
    }

    @Test
    public void shouldConvertNumber888ToDCCCLXXXVIII() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(888);

        assertThat(numeral, is("DCCCLXXXVIII"));
    }

    @Test
    public void shouldConvertNumber909ToCMIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(909);

        assertThat(numeral, is("CMIX"));
    }

    @Test
    public void shouldConvertNumber989ToCMLXXXIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(989);

        assertThat(numeral, is("CMLXXXIX"));
    }

    @Test
    public void shouldConvertNumber999ToCMXCIX() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(999);

        assertThat(numeral, is("CMXCIX"));
    }

    @Test
    public void shouldConvertNumber1004ToMIV() throws Exception {
        RomanNumerals romanNumerals = new RomanNumerals();

        String numeral = romanNumerals.convert(1004);

        assertThat(numeral, is("MIV"));
    }

}