package praktikum.pkg11;
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("indra capcay");
        mahasiswaList.add("angga kakap");
        mahasiswaList.add("Aji Pisang");
        mahasiswaList.add("rizal jagung");
        
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
    
}
