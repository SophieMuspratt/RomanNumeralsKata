package romanNumeralsKata;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class TestingRomanNumerals {

    RomanNumerals converter = new RomanNumerals();

    @Test
    public void entering1000GivesYouM(){
        assertEquals("M", converter.numberToNumeral(1000));
    }

    @Test
    public void entering500GivesYouD(){
        assertEquals("D", converter.numberToNumeral(500));
    }

    @Test
    public void entering100GivesYouC(){
        assertEquals("C", converter.numberToNumeral(100));
    }

    @Test
    public void entering50GivesYouL(){
        assertEquals("L", converter.numberToNumeral(50));
    }

    @Test
    public void entering10GivesYouX(){
        assertEquals("X", converter.numberToNumeral(10));
    }

    @Test
    public void entering5GivesYouV(){
        assertEquals("V", converter.numberToNumeral(5));
    }

    @Test
    public void entering1GivesYouI(){
        assertEquals("I", converter.numberToNumeral(1));
    }

    @Test
    public void entering900GivesYouCM(){
        assertEquals("CM", converter.numberToNumeral(900));
    }

    @Test
    public void entering600GivesYouDC(){
        assertEquals("DC", converter.numberToNumeral(600));
    }

    @Test
    public void entering400GivesYouCD(){
        assertEquals("CD", converter.numberToNumeral(400));
    }

    @Test
    public void entering90GivesYouXC(){
        assertEquals("XC", converter.numberToNumeral(90));
    }

    @Test
    public void entering40GivesYouXL(){
        assertEquals("XL", converter.numberToNumeral(40));
    }

    @Test
    public void entering1066GivesYouMLXVI(){
        assertEquals("MLXVI", converter.numberToNumeral(1066));
    }

    @Test
    public void entering1989GivesYouMCMLXXXIX(){
        assertEquals("MCMLXXXIX", converter.numberToNumeral(1989));
    }

    @Test
    public void entering8000GivesYouAnErrorMessage(){
        assertEquals("Number too large", converter.numberToNumeral(8000));
    }
}