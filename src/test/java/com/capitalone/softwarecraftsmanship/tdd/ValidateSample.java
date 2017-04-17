package com.capitalone.softwarecraftsmanship.tdd;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

/**
 * Created by mbh475 on 4/17/17.
 */
public class ValidateSample implements En {
    int first;
    int second;
    int sum;

    public ValidateSample() {
        Given("^The first number is (\\d+)$", (Integer first) -> {
            this.first = first;
        });
        And("^The second number is (\\d+)$", (Integer second) -> {
            // Write code here that turns the phrase above into concrete actions
            this.second = second;
        });
        When("^Adding the numbers together$", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.sum = this.first + this.second;
        });
        Then("^you get a total of (\\d+)$", (Integer sum) -> {
            // Write code here that turns the phrase above into concrete actions
            assertEquals(sum.intValue(), this.sum);
        });
    }
}
