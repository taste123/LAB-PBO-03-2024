package TP8_1_H071231073.TP8_2_H071231073;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int failedLoads = 0;

    public static void incrementFailedLoad() {
        failedLoads++;
    }

    public static void main(String[] args) {
        UIThread uithread = new UIThread();
        uithread.start(4);
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit background threads for data loading
        for (int i = 0; i < 4; i++) {
            executor.submit(new backgorundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uithread.loading(totalTime);
            }
            uithread.finish(totalTime, 4 - failedLoads, failedLoads);
        } catch (InterruptedException e) {
        }
    }
}
