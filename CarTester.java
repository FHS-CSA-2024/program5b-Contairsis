import java.util.Scanner;
public class CarTester{
    Scanner carScanner = new Scanner(System.in);
    String name ="";
    int miles = 0;
    int gallons = 0;
    public static void main(String[] args){
        CarTester tester = new CarTester();
        Car car1 = tester.addCar();
        System.out.println(car1.toString());
        Car car2 = tester.addCar();
        System.out.println(car2.toString());
    }
    public Car addCar(){
        System.out.println("Name of car: ");
        name = carScanner.next() + " " + carScanner.next();
        System.out.println("Miles driven: ");
        miles = carScanner.nextInt();
        System.out.println("Gallons used: ");
        gallons = carScanner.nextInt();
        return new Car(name, miles, gallons);
    }
    
}
/* output of test
Name of car: 
Honda Civic
Miles driven: 
234
Gallons used: 
100
Honda Civic averaged 2.3 m/g
Name of car: 
Toad Mobile
Miles driven: 
13
Gallons used: 
7
Toad Mobile averaged 1.9 m/g
 */
