//Nama	: Khairindra Eka Putra
//Nim	: 24060122140178
//Praktikum PBO ke- : 3
//Tanggal : 04-03-2024 

//class Lingkaran 
class Lingkaran{
	private double jariJari;
	public Lingkaran (double jariJari){
		this.jariJari=jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran =" +kelilingLingkaran);
	}
}

//Pertanyaan	: secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
//Jawaban		: menurut saya tidak 