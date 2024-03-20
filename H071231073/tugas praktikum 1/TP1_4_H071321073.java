import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("r = ");
                double r = scan.nextDouble();

                double pi = 3.14;
                double l = pi * r * r;

                System.out.printf(" Luas lingkaran dengan jari-jari " + r + " = %.2f", l);
                break;
            } catch (Exception e) {
                System.out.println("invalid input, please enter a number");
                scan.next();
                continue;
            }
        }
        scan.close();
    }
}