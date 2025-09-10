public class Student extends Person {
int rollNo;
String section;

Student(String name,int rollNo,String section){
    super(name);
    this.rollNo=rollNo;
    this.section=section;
}
public void printDetails(){
    System.out.println("Student details: ");
    System.out.println(this.name+ ","+this.rollNo+" ,"+section);

}

public static void main(String[] args) {
    Student student1 = new Student("Robert",1,"A");
    student1.print
}
}
