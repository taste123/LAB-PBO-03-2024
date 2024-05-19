package TP8_1_H071231073.TP8_2_H071231073;

public class backgorundThread extends Thread {
    @Override
    public void run() {
        int time = taskTimeHelper.getTime();
        try {
            Thread.sleep(time * 1000);
            if (time > 4) {
                System.out.println("request timeout!");
                Main.incrementFailedLoad();
            }
        } catch (InterruptedException e) {
        }
    }
}
