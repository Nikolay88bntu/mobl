package by.htp.homework_on_page125;

public class CorporateTariffs extends Tariffs{

	private String companyName;
	
public CorporateTariffs(){
	
}

public  void addTariff(String companyName, String tariffName){
	this.companyName = companyName;
	
}
int monthlyCost = 8;	
//public Client[] pensioneers = new Client[3];


Client client1corp = new Client("Ivan Corp", monthlyCost);
Client client2corp = new Client("Petr Corp", monthlyCost);
Client client3corp = new Client("Fedor Corp", monthlyCost);

public Client[] employees = new Client[3];

{employees[0] = client1corp;
employees[1] = client2corp;
employees[2] = client3corp;}

public Client[] getClients(){
	return employees;
}
public int getLength(){
	return employees.length;
}
public int getMonthlyCost(){
	return  monthlyCost;	
}
}

