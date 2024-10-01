public enum Specialty {
    FAMILY(250),
    PEDIATRICIAN(300),
    ALLERGIST(350);

    private final int charge;  // Private field to hold the charge per visit

    // Constructor for the enum constants
    Specialty(int charge) {
        this.charge = charge;
    }

    // Getter for the charge
    public int getCharge() {
        return charge;
    }

    @Override
    public String toString() {
        return String.format("%s (Charge per visit: $%d)", this.name(), charge);
    }
}
