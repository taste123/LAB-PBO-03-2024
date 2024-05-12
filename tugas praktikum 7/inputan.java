import java.util.Scanner;

public class inputan {
    static Scanner scan = new Scanner(System.in);
    static int x;
    static double y;
    static String z;

    public static int angkaInt(String word) {
        while (true) {
            System.out.print(word);
            try {
                int x = scan.nextInt();
                return x;
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!!");
                scan.nextLine();
            }
        }
    }

    public static double angkaDoub(String word) {
        while (true) {
            System.out.print(word);
            try {
                y = scan.nextDouble();
                return y;
            } catch (Exception e) {
                System.out.println("invalid input, must be a number!!!");
                scan.nextLine();
            }
        }
    }

    public static String wordString(String word) {
        Scanner scan = new Scanner(System.in);
        String z = "";
        while (true) {
            System.out.print(word);
            z = scan.nextLine();

            if (!z.isEmpty()) {
                return z;
            } else {
                System.out.println("invalid input,must fill the line!!!");
            }
        }
    }
}
