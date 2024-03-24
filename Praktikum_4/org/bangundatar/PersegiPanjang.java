//Nama	: Khairindra Eka Putra
//Nim	: 24060122140178
//Praktikum PBO ke- : 3
//Tanggal : 18-03-2024 

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
	private double panjang, lebar;
	
	public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return panjang * lebar;
	}
	
	public void printInfo(){
		System.out.println("Bangun Persegi Panjang Bersisi " + this.getJumlahSisi());
	}
}