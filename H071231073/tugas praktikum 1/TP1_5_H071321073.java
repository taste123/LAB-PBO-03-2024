import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.print("enter a number : ");
        int x = input.nextInt();
        finder(nums, x);
        input.close();

    }

    public static boolean finder(int[][] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == x) {
                    System.out.println("Found " + x + " at [" + i + "][" + j + "]");
                    return true;
                } else {
                    System.out.println(x + " not found");
                    return false;
                }
            }
        }
        return false;
    }
}