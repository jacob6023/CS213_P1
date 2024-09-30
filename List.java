package org.example;
public class List {
    private Appointment[] appointments;
    private int size; //number of appointments in the array

    private int find(Appointment appointment) {
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i].compareTo(appointment) == 0) {
                return i;
            }
        }
        return -1;
    } //helper method

    private void grow() {
        int x = appointments.length;
        Appointment[] newapp = new Appointment[x+4];
        for(int i = 0; i< appointments.length; i++){
            newapp[i] = appointments[i];
        }
        appointments= newapp;

        // helper method to increase the capacity by 4
    }

    public boolean contains(Appointment appointment) {
        List list = new List();
        if(list.find(appointment)== 1){
            return true;
        }
        // check before add/remove
        return false; // placeholder return, logic to be added
    }

    public void add(Appointment appointment) {
        int size = appointments.length;
        appointments[size] = appointment;
    }

    public void remove(Appointment appointment) { //edgecase find if its not in list;
        List list = new List();
        int x = list.find(appointment);
        appointments[x] = null; //removes appointment



    }

    public void printByPatient() {
        // ordered by patient profile, date/timeslot
    }

    public void printByLocation() {
        // ordered by county, date/timeslot
    }

    public void printByAppointment() {
        // ordered by date/timeslot, provider name
    }
}

