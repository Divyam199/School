package model;

public class Student {
    private String name;
    private int rollNo;
    private int age;

    //default constructor
    public Student() {

    }

    //parameterized constructor to set values
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}

