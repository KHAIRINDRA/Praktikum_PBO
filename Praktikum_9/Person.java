/* 	Nama 	: KHAIRINDRA EKA PUTRA
	NIM	: 24060122140178	*/

/**
 * File : Person.java
 * Deskripsi : Person databse model
 */
public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}