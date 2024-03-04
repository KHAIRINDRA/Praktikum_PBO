//Nama	: Khairindra Eka Putra
//Nim	: 24060122140178
//Praktikum PBO ke- : 3
//Tanggal : 04-03-2024 

public class Asersi1{
 public static void main (String[] args){
  int x = 1;
  if (x>0){
	System.out.println("x bilangan positif");
 }else{
	assert(x<0) : "ada kesalahan kode";
	System.out.println("x bilangan negatif");
	}
  }
}