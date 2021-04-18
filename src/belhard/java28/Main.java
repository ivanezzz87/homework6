package belhard.java28;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car (4,5,20000);
	Car car2 = new Car (4,3,15000);
	Motorcycle moto1 = new Motorcycle ( 3,170 );
	Motorcycle moto2 = new Motorcycle ( 3,300 );
	car1.printInfo ();
	System.out.println ("Стоимость:" + car1.getCost ());
    car2.printInfo ();
    System.out.println ("Стоимость:" + car2.getCost ());
    moto1.printInfo ();
    moto2.printInfo ();
    }
}
