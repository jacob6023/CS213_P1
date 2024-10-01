public class MedicalRecord {
    private Patient[] patients;
    private int size;

    //Constructor to initialize the MedicalRecord with a specific capacity
    public MedicalRecord(int capacity) {
        patients = new Patient[capacity];
        size = 0;
    }

    // Method to add a new patient to the MedicalRecord
    public void add(Patient patient) {
        // Check if the array needs to be expanded to accommodate more patients
        if (size == patients.length) {
            expandCapacity();
        }
        patients[size++] = patient;  // Add the new patient and increment size
    }

    // Helper method to double the size of the patients array when more space is needed
    private void expandCapacity() {
        Patient[] newPatients = new Patient[patients.length * 2];  // Double the current capacity
        System.arraycopy(patients, 0, newPatients, 0, patients.length);  // Copy existing patients to new array
        patients = newPatients;  // Replace the old array with the new one
    }

    // Method to get the current number of patients in the MedicalRecord
    public int getSize() {
        return size;
    }

    // Method to get a Patient at a specific index (for internal use, testing, or specific access needs)
    public Patient getPatient(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return patients[index];
    }
}
