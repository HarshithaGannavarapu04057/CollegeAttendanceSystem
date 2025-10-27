package model;

public class Student {
    private int id;
    private String name;
    private String rollNo;
    private String branch;
    private int year;

    public Student(int id, String name, String rollNo, String branch, int year) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.year = year;
    }

    public String getName() { return name; }
    public String getRollNo() { return rollNo; }
    public String getBranch() { return branch; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s - Year %d", name, rollNo, branch, year);
    }
}
