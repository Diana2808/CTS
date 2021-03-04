package ro.ase.csie.cts.sem2;

import java.math.BigDecimal;

import ro.ase.csie.cts.sem2.solid.BankAccount;
import ro.ase.csie.cts.sem2.solid.Person;

public class Main {
	public static void main(String[] args) {
		CalendarUtil cu = new CalendarUtil();
		
		try {
			System.out.println(cu.weekDay(4));
			System.out.println(cu.weekDay2(3));
			System.out.println(cu.weekDay3(1));
			
			double d1=1.02;
			double d2=0.43;
			System.out.println(d1-d2);
			
			BigDecimal bg1= new BigDecimal("1.02");
			BigDecimal bg2= new BigDecimal("0.43");
			System.out.println(bg1.subtract(bg2));
			
			
			
			//System.out.println(cu.weekDay4(10));
			

		}catch (IncorectDayException e) {
			// TODO Auto-generated catch block
		
			System.out.println(e.getMessage());
		}
		
		Person p=new Person("Ana");
		BankAccount account=new BankAccount("IMGB123242342",p);
		
		account.deposit(100);
		account.withdraw(50);
		account.withdraw(70);
		
		System.out.println(account.getBalance());

	}
}
