package ro.ase.csie.cts.sem4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.sem4.banking.BankAccount;
import ro.ase.csie.cts.sem4.banking.CreditBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.Person;
import ro.ase.csie.cts.sem4.singleton.Elvis;

public class Main {

	public static void main(String[] args) {
		
		NotificationService  emailService=new EmailNotificationService();
		
		Person p3=new Person("Van Damme");
		p3.setEmail("van@damme.com");
		p3.setMobile("0745356723");
		
		CreditBankAccount b=CreditBankAccount.createCreditBankAccountWithBalance(emailService,"INGB2434565", p3, 100);
		
		//instantiere
		CreditBankAccount b1=CreditBankAccount.createCreditBankAccount(emailService, "RFZ123453", p3);
		
		//o modalitate de a crea un obiect cu o metoda static sugestiva
		BigInteger bi=new BigInteger(24,11,new Random());
		BigInteger bi2=BigInteger.probablePrime(12, new Random());
		
		//aceasta nu creaza o instanta noua( are un de false si una true si ne o da pe cea aleasa )
		Boolean value=Boolean.valueOf(false);
		
		b.deposit(50);
		
		System.out.println(b.toString());
		
		Elvis elvis =Elvis.theTrueElvis;
		elvis.sing();
		
	}

}
