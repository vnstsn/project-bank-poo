package fr.banque;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(123, 9800);
		Client client1 = new Client("Doe", "John", 38, account1);
		System.out.println(client1);
	}

}
