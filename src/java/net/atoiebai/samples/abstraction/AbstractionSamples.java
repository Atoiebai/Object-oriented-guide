package net.atoiebai.samples.abstraction;

public class AbstractionSamples {

    public static void main(String[] args) {

        PersonWhoDontGiveAFuck eddie = new PersonWhoDontGiveAFuck();
        PersonWhoWantsOnlySuperCars jimmy = new PersonWhoWantsOnlySuperCars();

        CheapCar cheapCar = new CheapCar();
        SuperCar superCar = new SuperCar();

        eddie.setCar(cheapCar);
        eddie.setCar(new MediumPricedCar());
        eddie.setCar(superCar);
//        jimmy.setCar(cheapCar);


    }


}

class PersonWhoDontGiveAFuck {

    private Car car;

    public PersonWhoDontGiveAFuck() {
    }

    public PersonWhoDontGiveAFuck(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}

class PersonWhoWantsOnlySuperCars {

    private SuperCar car;

    public PersonWhoWantsOnlySuperCars() {
    }

    public PersonWhoWantsOnlySuperCars(SuperCar car) {
        this.car = car;
    }

    public SuperCar getCar() {
        return car;
    }

    public void setCar(SuperCar car) {
        this.car = car;
    }

}


