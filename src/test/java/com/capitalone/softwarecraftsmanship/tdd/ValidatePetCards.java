package com.capitalone.softwarecraftsmanship.tdd;

/**
 * Created by mbh475 on 4/12/17.
 */

import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class ValidatePetCards implements En {

    private Application application;

    private Result result;

    private String owner;
    private int age;
    private String species;

    public ValidatePetCards() {
        //Validator validator = new ValidatorImpl();
    }
}
