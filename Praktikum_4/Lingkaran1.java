//Nama	: Khairindra Eka Putra
//Nim	: 24060122140178
//Praktikum PBO ke- : 3
//Tanggal : 18-03-2024 

import java.util.Scanner;

class Lingkaran {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return Math.PI * jejari * jejari;
    }
}