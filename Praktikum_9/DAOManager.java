/* 	Nama 	: KHAIRINDRA EKA PUTRA
	NIM	: 24060122140178	*/

public class DAOManager{
	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}