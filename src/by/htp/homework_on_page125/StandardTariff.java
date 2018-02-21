package by.htp.homework_on_page125;

public class StandardTariff extends IndividualTariffs {
	
	int monthlyCost = 15;	
	
	public StandardTariff(){
		
	}

	
	Client client1st = new Client("Ivan Standart", monthlyCost);
	Client client2st = new Client("Petr Standart", monthlyCost);
	Client client3st = new Client("Fedor Standart", monthlyCost);

	public Client[] standartees = new Client[3];

	{standartees[0] = client1st;
	standartees[1] = client2st;
	standartees[2] = client3st;}

	public Client[] getClients(){
		return standartees;
	}
	public int getLength(){
		return standartees.length;
	}	
	public int getMonthlyCost(){
		return  monthlyCost;	
	}
}
