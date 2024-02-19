// Nama	 	   : KHAIRINDRA EKA PUTRA //
// NIM		   : 24060122140178 //
// Praktikum   : ke-1 //
// Tanggal	   : 19 - 02 - 2024 //
class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
	public Titik(){
			absis = 0;
			ordinat = 0;
			counterTitik++;
	}
	
	public Titik(double x, double y){
		this.absis = x;
		this.ordinat =y;
		counterTitik++;
	}
	
	void setAbsis(double x){
		this.absis = x;
	}
	
	void setOrdinat (double y){
		this.ordinat = y;
	}
	
	double getAbsis(){
		return this.absis;
	}
	
	double getOrdinat(){
		return this.ordinat;
	}
	
	static double getCounterTitik(){
		return counterTitik;
	}
	
}

	