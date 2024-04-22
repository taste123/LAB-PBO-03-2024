class Book {
    String judul, pengarang, genre, sinopsis;
    int durasi;

    public Book() { // constructor kosong
    }

    public Book(String judul, String pengarang, String genre, String sinopsis, int durasi) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.sinopsis = sinopsis;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    void showInfo() {
        System.out.println("\njudul       : " + this.judul);
        System.out.println("durasi      : +-" + this.durasi + " jam");
        System.out.println("pengarang   : " + this.pengarang);
        System.out.println("genre       : " + this.genre);
        System.out.println("sinopsis    : " + this.sinopsis + "\n");
    }
}

class selfUtils {
    static void displaySelfData() {
        System.out.println("Rayhanjahzari Muhammad Nuzilalfikri");
        System.out.println("H071231073");
    }
}

public class TP4_2_H071231073 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setJudul("lala land");
        b1.setDurasi(2);
        b1.setGenre("musikal");
        b1.setSinopsis("musikal sad ending");
        b1.setPengarang("herman");

        b1.showInfo();

        Book b2 = new Book("avanger", "agus", "action", "thanos mati", 3);
        System.out.println("\njudul       : " + b2.getJudul());
        System.out.println("durasi      : +-" + b2.getDurasi() + " jam");
        System.out.println("pengarang   : " + b2.getPengarang());
        System.out.println("genre       : " + b2.getGenre());
        System.out.println("sinopsis    : " + b2.getSinopsis() + "\n");

        selfUtils.displaySelfData();
    }

}
