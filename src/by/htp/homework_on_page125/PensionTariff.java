package by.htp.homework_on_page125;


public class PensionTariff extends IndividualTariffs {
	
int monthlyCost = 10;	
//public Client[] pensioneers = new Client[3];

public PensionTariff(){
	
}

//public Client[] pensioneers = new Client[3];
Client client1pens = new Client("Ivan Pens", monthlyCost);
Client client2pens = new Client("Petr Pens", monthlyCost);
Client client3pens = new Client("Fedor Pens", monthlyCost);

public Client[] pensioneers = new Client[3];

{pensioneers[0] = client1pens;
pensioneers[1] = client2pens;
pensioneers[2] = client3pens;}

public Client[] getClients(){
	return pensioneers;
}
public int getLength(){
	return pensioneers.length;
}
	public int getMonthlyCost(){
		return  monthlyCost;	
	}
	

}
