class  Product{
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Product {
    void drive() {
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.drive();
    }
}
