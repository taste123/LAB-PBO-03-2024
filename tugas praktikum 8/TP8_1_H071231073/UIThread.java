package TP8_1_H071231073.TP8_2_H071231073;

public class UIThread {

    public void start(int data) {
        System.out.println("start load " + data + "data");
    }

    public void loading(int time) {
        System.out.println("Loading... (" + time + "s)");
    }

    public void finish(int totalTime, int success, int fail) {
        System.out.println("Task finish");
        System.out.println("Time execution : " + totalTime + "s");
        if (fail > 0) {
            System.out.println(success + " Data succes loaded & " + fail + " Data failed to load");
        } else {
            System.out.println("All data is successfullyloaded");
        }
    }
}
