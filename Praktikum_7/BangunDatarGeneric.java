/*  NAMA : KKHAIRINDRA EKA PUTRA
    NIM : 24060122140178        */

public class BangunDatarGeneric<T extends BangunDatar>{
	private T BangunDatar;
	
	public void set(T tipeBangunDatar){
		BangunDatar = tipeBangunDatar;
	}
	
	public T get(){
		return BangunDatar;
	}
	
	public double hitungKeliling(){
		return BangunDatar.hitungKeliling();
	}
}