package by.htp.homework_on_page125;

public class Client {
	
	public Client(){
		
	}
	
private String clientName;
private int monthlyCost;

public Client(String clientName, int monthlyCost){
	this.clientName = clientName;
	this.monthlyCost = monthlyCost;
}
public String getClientName(){
	return clientName;
}
public int getmonthlyCost(){
	return monthlyCost;
}
public int countClients(){
	
	PensionTariff pt = new PensionTariff();
	KidsTariff kd = new KidsTariff();
	StandardTariff sd = new StandardTariff();
	CorporateTariffs ct = new CorporateTariffs();
	
	int amount = pt.getLength()+kd.getLength()+sd.getLength()+ct.getLength();
	System.out.println("Number of clients: " + amount);
	return amount;
	
}
}
