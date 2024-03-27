class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume() {
        return height * widht * length;
    }
}

public class TP2_3_H071231073 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.length = 15;
        cuboid.widht = 5;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
