// @author Jacob Jeong
public class Profile implements Comparable<Profile> {
    private String fName;
    private String lName;
    private Date dob;  // Using the custom Date class provided

    public Profile(String fName, String lName, int month, int day, int year) {
        this.fName = fName;
        this.lName = lName;
        this.dob = new Date(month, day, year);
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public Date getDateOfBirth() {
        return dob;
    }

    @Override
    public String toString() {
        return String.format("Profiles: First Name: '%s', Last Name: '%s', DOB: %s}", fName, lName, dob);
    }

    @Override
    public int compareTo(Profile other) {
        int lastCmp = lName.compareTo(other.lName);
        if (lastCmp != 0) return lastCmp;
        int firstCmp = fName.compareTo(other.fName);
        if (firstCmp != 0)

            return firstCmp;
        return dob.compareTo(other.dob);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check for reference equality.
        if (obj == null || !(obj instanceof Profile)) return false;  // Check for null and ensure the object is an instance of Profile.

        Profile other = (Profile) obj;  //Safe cast after instanceof check.

        //Check first name
        if (fName != null) {
            if (!fName.equals(other.fName)) return false;
        } else if (other.fName != null) {
            return false;
        }

        //Check last name
        if (lName != null) {
            if (!lName.equals(other.lName)) return false;
        } else if (other.lName != null) {
            return false;
        }

        //Check date of birth
        if (dob != null) {
            if (!dob.equals(other.dob)) return false;
        } else if (other.dob != null) {
            return false;
        }

        return true;  // If all fields are equal, return true.
    }




    public static void main(String[] args) {
        Profile p1 = new Profile("John", "Smith", 1, 1, 1990);
        Profile p2 = new Profile("Jane", "Doe", 5, 15, 1995);
        Profile p3 = new Profile("John", "Smith", 1, 1, 1990);

        // Comparing p1 with p3 - They should be identical
        System.out.println("Comparing p1 to p3 (should return 0): " + p1.compareTo(p3));
        System.out.println("Checking equality of p1 and p3 (should be true): " + p1.equals(p3));

        // Comparing p1 with p2 - They should be different
        System.out.println("Comparing p1 to p2 (should return a non-zero value): " + p1.compareTo(p2));
        System.out.println("Checking equality of p1 and p2 (should be false): " + p1.equals(p2));
    }
}
