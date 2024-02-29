// Nama	 	   : KHAIRINDRA EKA PUTRA //
// NIM		   : 24060122140178 //
// Praktikum   : ke-2 //
// Tanggal	   : 29 - 02 - 2024 //

public class Kubus {
    public int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int hitungVolume() {
        return sisi * sisi * sisi;
    }

    public int hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(5);
		System.out.println("===========================");
		System.out.println("Sisi : 5");
		System.out.println("===========================");
        System.out.println("Volume kubus 1: " + kubus1.hitungVolume());
        System.out.println("Luas permukaan kubus 1: " + kubus1.hitungLuasPermukaan());
		System.out.println("===========================");
    }
}
