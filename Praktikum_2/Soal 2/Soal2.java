// Nama	 	   : KHAIRINDRA EKA PUTRA //
// NIM		   : 24060122140178 //
// Praktikum   : ke-2 //
// Tanggal	   : 29 - 02 - 2024 //

class Soal2 {
    public static void main(String[] args) {
        // Soal 2
        Penjual penjual1 = new Penjual("Khairindraa", "Jl. Diponegoro No.99", "08123456789");
        Produk produk1 = new Produk("Laptop", "25.999.000", 5, "Laptop dengan Spesifikasi Tinggi", penjual1);
        produk1.getInfo();
        Penjual penjualTerkait = produk1.getPenjual();
        System.out.println("Info Penjual Terkait:");
        penjualTerkait.getInfo();
    }
}

class Penjual {
    private String nama;
    private String alamat;
    private String telepon;

    public Penjual(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public void getInfo() {
		System.out.println ();
        System.out.println("Nama	: " + nama);
        System.out.println("Alamat	: " + alamat);
        System.out.println("Telepon	: " + telepon);
		System.out.println("==================================================");
    }
}

class Produk {
    private String nama;
    private String harga;
    private int stok;
    private String deskripsi;
    private Penjual penjual;

    public Produk(String nama, String harga, int stok, String deskripsi, Penjual penjual) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.penjual = penjual;
    }

    public void getInfo() {
		System.out.println("==================================================");
        System.out.println("Nama Produk	: " + nama);
        System.out.println("Harga 		: Rp." + harga);
        System.out.println("Stok 		: " + stok);
        System.out.println("Deskripsi	: " + deskripsi);
		System.out.println ();
		System.out.println("==================================================");
		System.out.println ();
    }

    public Penjual getPenjual() {
        return penjual;
    }
}