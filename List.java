package org.example;
public class List {
    private Appointment[] appointments;
    private int size; //number of appointments in the array

    public List() {
        this.appointments = new Appointment [4];
        this.size = 0;
    }

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
        Appointment[] newApp = new Appointment[x+4];
        for(int i = 0; i< appointments.length; i++){
            newApp[i] = appointments[i];
        }
        appointments= newApp;

        // helper method to increase the capacity by 4
    }

    public boolean contains(Appointment appointment) {

        if(find(appointment)== 1){
            return true;
        }
        // check before add/remove
        return false; // placeholder return, logic to be added
    }

    public void add(Appointment appointment) {
        int length = appointments.length;
        if(size == length){
            grow();

        }
        appointments[size] = appointment;
        size++;


    }

    public void remove(Appointment appointment) { //edgecase find if its not in list;
        int x = find(appointment);
        if(x == -1){
            System.out.println("No Appointment");
        }
        int size = appointments.length;
        appointments[x] = null; //removes appointment
        Appointment[] newAppList = new Appointment[size-1];
        for(int i = 0; i <= size-1; i++){
            if(i == x){
                i+=1;
            }
            newAppList[i] = appointments[0];

        }

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

    public Appointment[] getAppointments() {
        return appointments;
    }

    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(appointments[i].toString()).append("\n");
        }
        return sb.toString();
    }
}


