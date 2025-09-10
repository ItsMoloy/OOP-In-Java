class Boy {
    int age;
    int Salary;

    Boy(int age, int Salary) {
        super();
        this.age = age;
        this.Salary = Salary;
    }
    void show() {
        System.out.println(age + " And his salary is " + Salary + " Taka");
    }
}

public class Main {
    public static void main(String[] args) {
        Boy moloy = new Boy(23, 1000000);
        Boy banerjee = new Boy(21, 2000000);
        moloy.show();
        banerjee.show();
    }
}
