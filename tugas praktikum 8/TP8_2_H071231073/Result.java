package TP8_2_H071231073;

public class Result {
    private String name;
    private int finishTime;

    public Result(String name, double d) {
        this.name = name;
        this.finishTime = (int) d;
    }

    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}
