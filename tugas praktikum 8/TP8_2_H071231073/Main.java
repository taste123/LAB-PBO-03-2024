package TP8_2_H071231073;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("\n|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");
        System.out.println();

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot ToKu", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
