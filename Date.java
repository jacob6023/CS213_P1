package org.example;
//@author Joshua Pae

public class Date implements Comparable<Date> {
    public static final int JANUARY = 1, MARCH = 3, MAY = 5, JULY = 7, AUGUST = 8, OCTOBER = 10, DECEMBER = 12;
    public static final int APRIL = 4, JUNE = 6, SEPTEMBER = 9, NOVEMBER = 11;
    public static final int FEBRUARY = 2;

    public static final int DAYS_31 = 31;
    public static final int DAYS_30 = 30;
    public static final int FEB_NON_LEAP = 28;
    public static final int FEB_LEAP = 29;

    public static final int QUADRENNIAL = 4;
    public static final int CENTENNIAL = 100;
    public static final int QUATERCENTENNIAL = 400;
    private int year;
    private int month;
    private int day;

    public Date(int month, int day, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean isValid() {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return day <= 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }
        if (month == 2) {

            if (isLeapYear()) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
        return false;
    }

    // Check if the year is a leap year
    public boolean isLeapYear() {
        if (year % QUADRENNIAL == 0) {
            if (year % CENTENNIAL == 0) {
                return year % QUATERCENTENNIAL == 0;
            }
            return true;
        }
        return false;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValid(Date date){
        return true;
    } //check if the date is a valid calendar date

    @Override
    public int compareTo(Date o) {
        if(this.year < o.year){
            return -1;
        } else if(this.year > o.year){
            return 1;

        }
        if(this.month < o.month){
            return -1;
        }
        else if(this.month > o.month) {
            return 1;
        }
        if(this.day < o.day){
            return -1;
        }else if(this.day > o.day){
            return 1;
        }
        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Date)){
            return false;
        }
        Date other = (Date) obj;  //downcast cast after instanceof check.

        return this.year == other.year &&
                this.month == other.month &&
                this.day == other.day;

       //If all fields are equal, return true.
    }
    @Override
    public String toString(){
        return month + "/" + day + "/" + year;
    }
    public static void main(String[] args) {
        Date date1 = new Date(2, 29, 2020);  //leap year
        Date date2 = new Date(2, 29, 2021);  //not leap year
        Date date3 = new Date(11, 31, 2021); //31 days for nov (30 day month)
        Date date4 = new Date(12, 31, 2021); //31 days
        Date date5 = new Date(6, 15, 2021);  //30 days

        // Test cases
        System.out.println("Is date1 valid? " + date1.isValid()); //true
        System.out.println("Is date2 valid? " + date2.isValid()); //false
        System.out.println("Is date3 valid? " + date3.isValid()); //false
        System.out.println("Is date4 valid? " + date4.isValid()); //true
        System.out.println("Is date5 valid? " + date5.isValid()); //true
    }
}




