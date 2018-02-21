package by.htp.homework_on_page125;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Tariffs tarr = new Tariffs();
		Client cl = new Client();
	
		
		System.out.println("Welcome to our Mobile Company!");
		System.out.println();
		System.out.println("Please, select a point from menue:");
		System.out.println();
		System.out.println("1 - View our tariffs");
		System.out.println ("2 - Sort tariffs according to monthly payment");
		System.out.println ("3 - View number of Clients");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		switch(i){
		case 1:
			tarr.printTariffs();
			break;
			
		case 2:
			tarr.sortTariffs();
			break;
			
		case 3:
			cl.countClients();
			break;
		}
		}
}
