package org.example;

public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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
        if(this.year != o.year){
            return this.year - o.year;
        }
        if(this.month != o.month){
            return this.month - o.month;
        }
        if(this.day != o.day){
            return this.day - o.day;
        }
        return 0;
    }
}

