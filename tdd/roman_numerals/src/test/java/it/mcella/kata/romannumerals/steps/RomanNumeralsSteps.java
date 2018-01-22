package it.mcella.kata.romannumerals.steps;

import cucumber.api.java8.En;
import it.mcella.kata.romannumerals.RomanNumerals;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsSteps implements En {

    private RomanNumerals romanNumerals;
    private String numeral;

    public RomanNumeralsSteps() throws Throwable {

        Given("I have started the converter", () -> {
            romanNumerals = new RomanNumerals();
        });

        When("I enter (\\d+)", (Integer number) -> {
            numeral = romanNumerals.convert(number);
        });

        Then("(.*) is returned", (String expectedNmeral) -> {
            assertThat(numeral, is(expectedNmeral));
        });

    }
}
