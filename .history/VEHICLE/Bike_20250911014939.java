package VEHICLE;

public class Bike extends Vehicle{

String country;

Bike(String name,int price ,String country){
    super(name,price);
    this.country=country;
}

public void printAll(){
    System.out.println("Bike details: ");
    System.out.println(this.name+ " , "+ this.price + " ,"+ country);
}

public static void main(String[] args){
    Bike hundredBike= new Bike("Hundred",)
}

}
