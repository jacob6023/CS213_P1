public class Appointment implements Comparable<Appointment> {
    private Date date;
    private Timeslot timeslot;
    private Profile patient;
    private Provider provider;

    public Appointment(Date date, Timeslot timeslot, Profile patient, Provider provider) {
        this.date = date;
        this.timeslot = timeslot;
        this.patient = patient;
        this.provider = provider;
    }

    @Override
    public int compareTo(Appointment other) {
        int dateCmp = this.date.compareTo(other.date);
        if (dateCmp != 0) return dateCmp;
        int slotCmp = this.timeslot.compareTo(other.timeslot);
        if (slotCmp != 0) return slotCmp;
        return this.patient.compareTo(other.patient);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Appointment) {
            Appointment other = (Appointment) obj;
            return this.date.equals(other.date) && this.timeslot == other.timeslot && this.patient.equals(other.patient);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s at %s with %s [%s]", date, timeslot, patient, provider);
    }
}
