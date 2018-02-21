package by.htp.homework_on_page125;

public class KidsTariff extends IndividualTariffs {
	
int monthlyCost = 5;	
	
	public KidsTariff(){
		
	}

	
	Client client1kid = new Client("Ivan kid", monthlyCost);
	Client client2kid = new Client("Petr kid", monthlyCost);
	Client client3kid = new Client("Fedor kid", monthlyCost);

	public Client[] kids = new Client[3];

	{kids[0] = client1kid;
	kids[1] = client2kid;
	kids[2] = client3kid;}

	public Client[] getClients(){
		return kids;
	}
	public int getLength(){
		return kids.length;
	}
	public int getMonthlyCost(){
		return  monthlyCost;	
	}
}
