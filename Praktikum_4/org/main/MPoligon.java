//Nama	: Khairindra Eka Putra
//Nim	: 24060122140178
//Praktikum PBO ke- : 3
//Tanggal : 18-03-2024 

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
		Segitiga segitiga = new Segitiga(2, 10, 3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
	}
}