package fr.banque;

import java.util.Arrays;
import java.util.Objects;

public class Client {
	private String name;
	private String surname;
	private int age;
	private int number;
	private Account[] account = new Account[5];
	
	public Client() {
	}
	
	public Client(String name, String surname, int age, int number) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.number = number;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	protected void setNumber(int number) {
		this.number = number;
	}
	
	protected Account getAccount() {
		return account[account.length] ;
	}
	
	protected void getAccount(Account[] account, int number) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", surname=" + surname + ", age=" + age + ", number=" + number + ", account="
				+ Arrays.toString(account) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(account);
		result = prime * result + Objects.hash(age, name, number, surname);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Arrays.equals(account, other.account) && age == other.age && Objects.equals(name, other.name)
				&& number == other.number && Objects.equals(surname, other.surname);
	}

		
}
