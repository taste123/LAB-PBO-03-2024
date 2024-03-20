import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                int[] y = getY(scan);
                convertDate(y);
                scan.close();
                break;
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
            }
        }
    }

    private static int[] getY(Scanner scan) {
        System.out.print("Enter date : ");
        String date = scan.nextLine();
        String[] x = date.split("-");

        int[] y = new int[3];
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        return y;
    }

    public static void convertDate(int[] y) {

        // day
        System.out.print(y[0] + " ");

        // month
        String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "November", "December" };
        System.out.print(month[y[1] - 1] + " ");

        // year
        if (y[2] <= 30 && y[2] >= 0) {
            System.out.println(2000 + y[2]);
        } else {
            System.out.println(1900 + y[2]);

        }

    }
}