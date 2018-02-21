package by.htp.homework_on_page125;

public class Tariffs {

	private String tariffType;
	private String tariffName;
	private int amountClients;
	private int monthlyCost;
	
	public Tariffs(){
	
	}
	public String addTariff(String tariffName){
		this.tariffName = tariffName;
		return tariffName;
	}
	public String addClient(String name){
		this.tariffName = name;
		return name;
	}
	
	public int getMonthlyCost(int monthlyCost){
		this.monthlyCost = monthlyCost;
		
			return monthlyCost;
		}
	//}
	public void printTariffs(){
		System.out.println("Individual tariffs: Pension, Standard, Kids.");
		System.out.println("Corparete tariffs: Corporate");
		
	}
	public void sortTariffs(){
		PensionTariff pt = new PensionTariff();
		KidsTariff kd = new KidsTariff();
		StandardTariff sd = new StandardTariff();
		CorporateTariffs ct = new CorporateTariffs();
		int []monthlyPayment = new int [4];
		System.out.println("Sorted tariffs are:");
		int monthlyPayment1 = pt.getMonthlyCost();
		System.out.println(monthlyPayment1);
		int monthlyPayment2 = kd.getMonthlyCost();
		System.out.println(monthlyPayment2);
		int monthlyPayment3 = sd.getMonthlyCost();
		System.out.println(monthlyPayment3);
		int monthlyPayment4 = ct.getMonthlyCost();
		System.out.println(monthlyPayment4);
		
}
}

