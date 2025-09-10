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
        System.out.println(this.name+" , "+ this.rollNo + " , "+ section);
    }

    public void printDetails(boolean hideSection){
        System.out.print("Student Details: ");
        System.out.println(this.name);
    }

}
