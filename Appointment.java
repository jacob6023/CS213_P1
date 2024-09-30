package org.example;

public class Appointment implements Comparable <Appointment> {
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

    public Date getDate() {
        return date;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public Profile getPatient() {
        return patient;
    }

    public Provider getProvider() {
        return provider;
    }

    @Override
    public int compareTo(Appointment o){
        if(this.date.compareTo(o.date)!= 0){
            return -1;
        }
        if(this.timeslot != o.timeslot){
            return -1;
        }
        return 0;
    }


}
