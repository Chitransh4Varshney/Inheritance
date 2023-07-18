package Inheritance;

class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is takeoff");
    }

    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane {
    public void fly() {
        System.out.println("Cargoplane is flies at lower height");
    }

    public void carryGoods() {
        System.out.println("Cargoplane carries goods");
    }
}

class PassengerPlane extends Aeroplane {
    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }

    public void CarryPassenger() {
        System.out.println("PassengerPlane carries passenger");
    }
}

public class InheritanceTypesMethods {
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
    }

}
