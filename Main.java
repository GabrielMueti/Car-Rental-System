import java.util.Scanner;
class Car {
    String carmodel;
    String numberplate;
    String dayrented;
    String dayreturned;
    int rentingprice;
    public Car(String model, String plate, String rented, int price) {
        this.carmodel = model;
        this.numberplate = plate;
        this.dayrented = rented;
        this.rentingprice = price;
    }
    public void carReturned(String day) {
        this.dayreturned = day;
    }
}
class Customermanagement {
    String customername;
    String rentperiod;

    public Customermanagement(String name, String period) {
        this.customername = name;
        this.rentperiod = period;
    }
}
class Rentalagency {
    public static void transactions(Car car, Customermanagement customer) {
        System.out.println("Recorded transactions");
        System.out.println("Model: " + car.carmodel);
        System.out.println("Number plate: " + car.numberplate);
        System.out.println("Customer name: " + customer.customername);
        System.out.println("Rental period: " + customer.rentperiod);
    }
    public static void receipt(Car car, Customermanagement customer) {
        System.out.println("Receipt");
        System.out.println("Model: " + car.carmodel);
        System.out.println("Number plate: " + car.numberplate);
        System.out.println("Customer name: " + customer.customername);
        System.out.println("Rental period: " + customer.rentperiod);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model:");
        String carmodel = scanner.nextLine();
        System.out.println("Enter car numberplate:");
        String carnumberplate = scanner.nextLine();
        System.out.println("Enter day nd date rented:");
        String dayrented = scanner.nextLine();
        System.out.println("Enter price:");
        int rentingprice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter customer name:");
        String customername = scanner.nextLine();
        System.out.println("Enter rental period (in days):");
        String rentperiod = scanner.nextLine();

        Car car = new Car(carmodel, carnumberplate, dayrented,rentingprice);
        Customermanagement customer = new Customermanagement(customername,rentperiod);
        Rentalagency rentalAgency = new Rentalagency();
        rentalAgency.transactions(car,customer);

        System.out.println("Enter returned day and date:");
        String returnTime = scanner.nextLine();
        car.carReturned(returnTime);

        scanner.close();
    }
}