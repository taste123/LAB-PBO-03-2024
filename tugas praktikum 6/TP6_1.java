interface Move {
    void move(); // 1 interface
}

abstract class Dog implements Move {
    int position, avarageLength;

    abstract void describe();

    public Dog(int position, int avarageLength) {
        this.position = position;
        this.avarageLength = avarageLength;
    }
}

class Pitbull extends Dog {
    public Pitbull(int position, int avarageLength) {
        super(position, avarageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("\nposition of Pitbull : " + this.position);
    }

    @Override
    void describe() {
        System.out.println("\naverage length of Pitbull : " + this.avarageLength + "cm");
        System.out.println("characteristics :\nStrong\nTenacious\nPlayful\nThick, short, and shiny coat");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int avarageLength) {
        super(position, avarageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("\nposition of Siberian Husky : " + this.position);
    }

    @Override
    void describe() {
        System.out.println("\naverage length of Siberian Husky : " + this.avarageLength + "cm");
        System.out.println("characteristics :\nAthletic\nMuscular\nLean\nLong-limbed");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int avarageLength) {
        super(position, avarageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("\nposition of Bulldog : " + this.position);
    }

    @Override
    void describe() {
        System.out.println("\naverage length of Bulldog : " + this.avarageLength + "cm");
        System.out.println("characteristics :\nSaggy cheeks\nPlayful\nShades of brown to red");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int avarageLength) {
        super(position, avarageLength);
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("\nposition  of German Shepherd: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("\naverage length of German Shepherd : " + this.avarageLength + "cm");
        System.out.println("characteristics :\nHighly active\nEnergetic\nAthletic");
    }
}

class Smartphone implements Move {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("\nSmartphone berpindah");
    }
}

class Car implements Move {
    int totalForwardGear, maxSpeed;
    String color;

    public Car(int totalForwardGear, int maxSpeed, String color) {
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("\nMobil sedang berakselerasi");
    }
}

class Main {

    public static void main(String[] args) {
        Smartphone handphone = new Smartphone(10000000, "Apple");
        handphone.move();

        Car car = new Car(900000000, 250, "chrome");
        car.move();

        Bulldog bulldog = new Bulldog(3, 55);
        bulldog.move();
        bulldog.describe();
    }
}