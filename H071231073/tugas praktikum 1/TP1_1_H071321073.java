import java.util.Scanner;

public class no1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        int jumlah = input.nextInt();

        int bulat = 0;
        int desimal = 0;

        for (int i = 0; i < jumlah; i++) {
            double hitung = input.nextDouble();

            if (hitung == (int) hitung) {
                bulat++;
            } else {
                desimal++;
            }
        }

        System.out.println("\n" + bulat + " bilangan bulat" + "\n" + desimal + " bilangan desimal");

        input.close();
    }
}
