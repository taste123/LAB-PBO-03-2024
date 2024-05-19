package TP8_2_H071231073;

public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        // TODO (1)
        double howLongToType = (60 * 1000) / wpm;

        // TODO (2)
        for (String word : wordsToType) {
            addWordTyped(word);
            try {
                Thread.sleep((long) howLongToType);
            } catch (InterruptedException e) {
            }
        }

        this.addWordTyped("(selesai)");

        // TODO (3)
        typeRacer.addResult(new Result(botName, (int) (wordsToType.length * howLongToType)));
    }
}
