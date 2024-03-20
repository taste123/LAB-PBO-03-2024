import java.util.Scanner;

public class livecode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter title : ");
        String text = scan.nextLine();
        String word = text.toLowerCase();
        String[] arr = word.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1));
            System.out.print(" ");
            scan.close();
        }
    }

}
