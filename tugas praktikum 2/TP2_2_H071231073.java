import java.util.Scanner;

class Produk {
    String id;
    String nama;
    int stok;
    double harga;

    void setId(String inputId) {
        id = inputId;
    }

    void setNama(String inputNama) {
        nama = inputNama;
    }

    void setStok(int inputStok) {
        stok = inputStok;
    }

    void setHarga(double inputHarga) {
        harga = inputHarga;
    }

    String getId() {
        return id;
    }

    String getNama() {
        return nama;
    }

    int getStok() {
        return stok;
    }

    double getHarga() {
        return harga;
    }

    String isTersedia() {
        if (stok > 0) {
            return "Tersedia";
        } else {
            return "Tidak Tersedia";
        }
    }
}

public class TP2_2_H071231073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input id : ");
        String id = input.nextLine();
        System.out.print("input nama : ");
        String nama = input.nextLine();
        System.out.print("input stok : ");
        int stok = input.nextInt();
        System.out.print("input harga : ");
        double harga = input.nextDouble();

        Produk susu = new Produk();
        susu.setId(id);
        susu.setNama(nama);
        susu.setStok(stok);
        susu.setHarga(harga);
        System.out.println("id Produk = " + susu.getId() + "\n" +
                "Nama Produk = " + susu.getNama() + "\n" +
                "Stok = " + susu.getStok() + "\n" +
                "Harga Produk = " + susu.getHarga() + "\n" +
                "Ketersediaan Produk = " + susu.isTersedia());
    }
}
