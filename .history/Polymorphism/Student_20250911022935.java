package Polymorphism;

public class Student {
    String name;
    int rollNo;
    String section;

    Student(String name,int rollNo,String section){
        this.name=name;
        this.rollNo=rollNo;
        this.section=section;
    }
    public void printDetails(){
        System.out.print("Student details : ");
    }
}
