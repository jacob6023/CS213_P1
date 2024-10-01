public enum Location {
    BRIDGEWATER("Somerset", "08807"),
    EDISON("Middlesex", "08817"),
    PISCATAWAY("Middlesex", "08854"),
    PRINCETON("Mercer", "08540"),
    MORRISTOWN("Morris", "07960"),
    CLARK("Union", "07066");

    private final String county;
    private final String zip;

    // Constructor for the enum constants
    Location(String county, String zip) {
        this.county = county;
        this.zip = zip;
    }

    // Getter for county
    public String getCounty() {
        return county;
    }

    // Getter for zip
    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, ZIP: %s", this.name(), county, zip);
    }
}
