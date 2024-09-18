public class Patient implements Comparable<Patient> {
    private Profile profile;
    private Visit visits; //a linked list of visits (completed appt.)
    public int charge() {} //traverse the linked list to compute the charge
}