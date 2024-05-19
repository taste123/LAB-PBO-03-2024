package TP8_1_H071231073.TP8_2_H071231073;

import java.util.Random;

public class taskTimeHelper {
    public static int getTime() {
        int x = new Random().nextInt(1, 7);
        return x;
    }
}