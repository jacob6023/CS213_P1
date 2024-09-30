public class List {
    private static final int NOT_FOUND = -1;
    private static final int INITIAL_CAPACITY = 4;
    private Appointment[] appointments;
    private int size;

    public List() {
        this.appointments = new Appointment[INITIAL_CAPACITY];
        this.size = 0;
    }

    private void grow() {
        Appointment[] newAppointments = new Appointment[appointments.length + INITIAL_CAPACITY];
        System.arraycopy(appointments, 0, newAppointments, 0, size);
        appointments = newAppointments;
    }

    public void add(Appointment appointment) {
        if (size == appointments.length) {
            grow();
        }
        appointments[size++] = appointment;
    }

    public void remove(Appointment appointment) {
        int index = find(appointment);
        if (index != NOT_FOUND) {
            for (int i = index; i < size - 1; i++) {
                appointments[i] = appointments[i + 1];
            }
            appointments[--size] = null;
        }
    }

    private int find(Appointment appointment) {
        for (int i = 0; i < size; i++) {
            if (appointments[i].equals(appointment)) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    //in place sort
    private void sortAppointments() {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < size; i++) {
                if (appointments[i - 1].compareTo(appointments[i]) > 0) {
                    Appointment temp = appointments[i];
                    appointments[i] = appointments[i - 1];
                    appointments[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public void printByPatient() {
        sortAppointments(); //sortAppointments sorts by patient by default
        for (Appointment appointment : appointments) {
            if (appointment != null) System.out.println(appointment);
        }
    }

    public void printByLocation() {
        //Assuming a different sort method for location
        for (Appointment appointment : appointments) {
            if (appointment != null) System.out.println(appointment);
        }
    }

    public void printByAppointment() {
        sortAppointments();
        for (Appointment appointment : appointments) {
            if (appointment != null) System.out.println(appointment);
        }
    }
}
