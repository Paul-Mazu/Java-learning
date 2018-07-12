package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class Country {

    final String countryName;
    final BigDecimal peopleQty;

    public Country(final String countryName, final BigDecimal peopleQty) {
        this.countryName = countryName;
        this.peopleQty = peopleQty;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQty() {
        return peopleQty;
    }
}
