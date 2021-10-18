package fr.banque;
import java.util.Objects;

public class Account {
		private int number;
		private double balance;
		
		public Account() {}
		
		public Account(int number, double balance) {
			this.number = number;
			this.balance = balance;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public int getNumber() {
			return this.number;
		}
		
		protected void setNumber(int number) {
			this.number = number;
		}
		
		protected void setBalance(double balance) {
			this.balance = balance;
		}
		
		/** 
		 * function to add or withdraw an amount 
		 * @param amount
		 * @return newBalance 
		 */
		public double addAmount(double amount) {
			double newBalance = this.getBalance() + amount;
			return newBalance;
		}
		
		public double withdrawAmount(double amount) { //retirer amount from balance => new balance
			double newBalance = this.getBalance() - amount;
			return newBalance;
		}

		@Override
		public String toString() {
			return "Compte [number=" + number + ", balance=" + balance + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(balance, number);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Account other = (Account) obj;
			return Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance) && number == other.number;
		}
		
		
		
}
