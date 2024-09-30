public class MedicalRecord {
    private static final int INITIAL_CAPACITY = 4;
    private Patient[] patients;
    private int size;

    //Constructor
    public MedicalRecord() {
        patients = new Patient[INITIAL_CAPACITY];
        size = 0;
    }

    //Method to add a patient to the medical record
    public void add(Patient patient) {
        if (size == patients.length) {
            grow();
        }
        patients[size++] = patient;
    }

    //Helper method when array is full
    private void grow() {
        Patient[] newPatients = new Patient[patients.length + INITIAL_CAPACITY];
        System.arraycopy(patients, 0, newPatients, 0, size);
        patients = newPatients;
    }

    //Prints patients
    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i].toString());
        }
    }

    //Test MedicalRecord class
    public static void main(String[] args) {
        MedicalRecord record = new MedicalRecord();

        // Sample patients
        Profile profile1 = new Profile("John", "Doe", new Date(12, 13, 1989));
        Profile profile2 = new Profile("Jane", "Smith", new Date(5, 20, 1990));

        Patient patient1 = new Patient(profile1);
        Patient patient2 = new Patient(profile2);

        record.add(patient1);
        record.add(patient2);

       //Print
        record.printAllPatients();
    }
}
