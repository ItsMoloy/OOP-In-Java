public class Vehicle {
    String name;
    int price;

    Vehicle(String name,int price){
        this.name=name;
        this.price=price;
    }

    public void printDetails(){
        System.out.println("Details of the vehicle: ");
        System.out.println(this.name+" , "+ this.price);
    }
    public static void main(String[] args) {
    Vehicle car= new Vehicle("BMW",100000);
    

    }
