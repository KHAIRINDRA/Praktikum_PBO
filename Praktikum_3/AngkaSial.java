//Nama	: Khairindra Eka Putra
//Nim	: 24060122140178
//Praktikum PBO ke- : 3
//Tanggal : 04-03-2024 

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage () telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukan angka!!!");
		}
	}
}	

//PERTANYAAN:
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

//Jawaban : 
// 1. tidak, dia akan mengeksekusi AngkaSialException.java
// 2. iya dieksekusi