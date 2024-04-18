class AnakTetangga {
    Anak anak = new Anak();
    String loser = "";
    int winner = 0;
    int piala;

    public Anak getAnak() {
        return anak;
    }

    public void setAnak(Anak anak) {
        this.anak = anak;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner() {
        this.winner++;
    }

    public int getPiala() {
        return piala;
    }

    public void setPiala(int piala) {
        this.piala = piala;
    }

    public String getLoser() {
        return loser;
    }

    public void setLoser(String loser) {
        if (!this.loser.contains(loser)) {
            this.loser += loser + ", ";
            this.setWinner();
        }
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public AnakTetangga(String nama, String ortu, int piala) {
        this.anak.nama = nama;
        this.anak.ortu = ortu;
        this.piala = piala;
    }

    public AnakTetangga() {
        this.anak.nama = "";
        this.anak.ortu = "";
        this.piala = 0;
    }

    void showInfo() {
        System.out.println("\n===================INFO====================");
        System.out.println("Nama            : " + this.anak.nama);
        System.out.println("anaknya         : " + this.anak.ortu);
        System.out.println("Jumlah piala    : " + this.piala);
        System.out.println("-------------------------------------------");
        if (this.getLoser().length() < 1) {
            System.out.println(this.anak.nama + " lebih pintar dari     : -");
        } else {
            System.out.println(this.anak.nama + " lebih pintar dari     : "
                    + this.getLoser().substring(0, this.getLoser().length() - 2));
        }
        System.out.println("jumlah anak yang dikalahkan : " + this.winner);
        System.out.println("===========================================\n");
    }

    void Battle(AnakTetangga enemy) {
        System.out.println("\n==================BATTLE==================");
        System.out.println(this.anak.nama.toUpperCase() + " VS " + enemy.anak.getNama().toUpperCase());
        System.out.println("------------------------------------------");
        System.out.println("jumlah prestasi : " + this.getPiala() + " VS " + enemy.getPiala());
        if (this.piala > enemy.getPiala()) {
            System.out.println(this.anak.getNama() + " > " + enemy.anak.getNama());
            System.out.println("------------------------------------------");
            System.out.println(this.anak.getNama() + " anak dari " + this.anak.getOrtu() + " WIN THIS BATTLE");
            setLoser(enemy.anak.getNama());
            System.out.println(this.anak.nama + " lebih pintar dari " + enemy.anak.getNama());
        } else if (this.getPiala() == enemy.getPiala()) {
            System.out.println(this.anak.getNama() + " = " + enemy.anak.getNama());
            System.out.println("------------------------------------------");
            System.out.println("DRAW");
            System.out.println(this.anak.nama + " sama pintarnya dengan " + enemy.anak.getNama());
        } else {
            System.out.println(this.anak.getNama() + " < " + enemy.anak.getNama());
            System.out.println("------------------------------------------");
            System.out.println(
                    enemy.getAnak().getNama() + " anak dari " + enemy.getAnak().getOrtu() + " WIN THIS BATTLE");
            System.out.println(enemy.anak.getNama() + " lebih pintar dari " + this.anak.nama);
            enemy.setLoser(this.anak.getNama());
        }
        System.out.println("==========================================\n");
    }
}

class Anak {
    String nama, ortu;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getOrtu() {
        return ortu;
    }

    public void setOrtu(String ortu) {
        this.ortu = ortu;
    }
}

public class Main {

    public static void main(String[] args) {
        AnakTetangga xavier = new AnakTetangga("xavier", "herman", 6);
        AnakTetangga zayn = new AnakTetangga("zayn", "udin", 3);
        AnakTetangga qiana = new AnakTetangga("qiana", "maemunah", 5);
        AnakTetangga anela = new AnakTetangga("anela", "jamal", 8);

        qiana.showInfo();
        anela.showInfo();

        xavier.Battle(anela);
        qiana.Battle(zayn);
        xavier.Battle(qiana);
        anela.Battle(qiana);

        qiana.showInfo();
        xavier.showInfo();
        anela.showInfo();
    }
}