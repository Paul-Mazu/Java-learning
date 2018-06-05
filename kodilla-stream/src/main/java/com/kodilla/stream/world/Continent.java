package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {


    public List<String> countriesOfAsia() {
        List<String>asianCountries = new ArrayList<>();
        asianCountries.add("China");
        asianCountries.add("Israel");
        asianCountries.add("Japan");
        asianCountries.add("North Korea");
        asianCountries.add("Hong Kong");
        return asianCountries;
    }
    public List<String> countriesOfAfrica() {
        List<String>africanCountries = new ArrayList<>();
        africanCountries.add("Egipt");
        africanCountries.add("Gambia");
        africanCountries.add("Ghana");
        africanCountries.add("Kenya");
        africanCountries.add("Lybia");
        return africanCountries;
    }
    public List<String> countriesOfNorthAmerica() {
        List<String>northAmericanCountries = new ArrayList<>();
        northAmericanCountries.add("United States");
        northAmericanCountries.add("Canada");
        northAmericanCountries.add("Cuba");
        northAmericanCountries.add("Haiti");
        northAmericanCountries.add("Mexico");
        return northAmericanCountries;
    }
    public List<String> countriesOfSouthAmericaa() {
        List<String>southAmericanCountries = new ArrayList<>();
        southAmericanCountries.add("Brazil");
        southAmericanCountries.add("Colombia");
        southAmericanCountries.add("Argentina");
        southAmericanCountries.add("Venezuela");
        southAmericanCountries.add("Peru");
        return southAmericanCountries;
    }
    public List<String> countriesOfEurope() {
        List<String>europeanCountries = new ArrayList<>();
        europeanCountries.add("Poland");
        europeanCountries.add("Germany");
        europeanCountries.add("Austria");
        europeanCountries.add("Holland");
        europeanCountries.add("France");
        return europeanCountries;
    }
    public List<String> countriesOfAustralia() {
        List<String>australianCountriea = new ArrayList<>();
        australianCountriea.add("Australia");
        australianCountriea.add("Fiji");
        australianCountriea.add("New Zealand");
        australianCountriea.add("Samoa");
        australianCountriea.add("Tonga");
        return australianCountriea;
    }
}
