public class Profile implements Comparable<Profile> {
    private String fname;
    private String lname;
    private Date dob;

    public Profile(String fname, String lname, Date dob) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    @Override
    public int compareTo(Profile other) {
        int lastCmp = this.lname.compareToIgnoreCase(other.lname);
        if (lastCmp != 0) return lastCmp;
        int firstCmp = this.fname.compareToIgnoreCase(other.fname);
        if (firstCmp != 0) return firstCmp;
        return this.dob.compareTo(other.dob);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Profile) {
            Profile other = (Profile) obj;
            return this.fname.equalsIgnoreCase(other.fname) &&
                    this.lname.equalsIgnoreCase(other.lname) &&
                    this.dob.equals(other.dob);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %s, DOB: %s", fname, lname, dob);
    }
}
