
class Alamat {
    String jalan;
    String kota;

    public String getAlamat() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    public String getAlamat() {
        return alamat.getAlamat();
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}

public class TP2_4_H071231073 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Ray";
        mahasiswa.nim = "H071231073";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}