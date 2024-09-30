package org.example;

public enum Provider {
    PROVIDER_1("Patel", "Bridgewater", "Family"),
    PROVIDER_2("Lim", "Bridgewater", "Pediatrician"),
    PROVIDER_3("Zimnes", "Clark", "Family"),
    PROVIDER_4("Harper", "Clark", "Family"),
    PROVIDER_5("Kaur", "Princeton", "Allergist"),
    PROVIDER_6("Taylor", "Piscataway", "Pediatrician"),
    PROVIDER_7("Ramesh", "Morristown", "Allergist"),
    PROVIDER_8("Ceravolo", "Edison", "Pediatrician");

    private final String name;
    private final String town;
    private final String specialty;
    Provider(String name, String town, String specialty){
        this.name = name;
        this.town = town;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getSpecialty() {
        return specialty;
    }
    @Override
    public String toString() {
        return name + " (" + specialty + ") - " + town;
    }
}

