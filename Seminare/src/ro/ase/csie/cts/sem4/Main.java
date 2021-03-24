package ro.ase.csie.cts.sem4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.sem4.banking.BankAccount;
import ro.ase.csie.cts.sem4.banking.CreditBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.InsuficientFundsException;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.Person;
import ro.ase.csie.cts.sem4.singleton.Bank;
import ro.ase.csie.cts.sem4.singleton.Elvis;
import ro.ase.csie.cts.sem4.singleton.ElvisV2;

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
		
		// test SINGLETON
		Elvis elvis =Elvis.getInstance();
		elvis.sing();
		
		Elvis elvis2= Elvis.getInstance();
		System.out.println(elvis==elvis2);
		
		// explicatie -> daca apelam getInstance() care returneaza instanta creata static in clasa,
		// voi primi aceeasi instanta. Daca aceasta returneaza constructorul, mereu va returna alta instanta
		// pt ca, constructorul creaza mereu altceva
		
		
		// partea de enum singletone
		ElvisV2 elvisv2=ElvisV2.INSTANCE;
		elvisv2.sing(); 
		
		//
		Bank bank=Bank.getInstance();
		
		Person adult=new Person("Van Damme");
		adult.setEmail("vandd@damme.com");
		adult.setMobile("0745356723");
		adult.setAge(30);
		adult.setNotificationType(Person.NotificationType.EMAIL);
		
		Person child=new Person("Van Damme");
		child.setEmail("vancvdf@damme.com");
		child.setMobile("0745356723");
		child.setAge(14);
		child.setNotificationType(Person.NotificationType.SMS);
		
		DebitBankAccount debit1=bank.openDebitAccount(adult);
		DebitBankAccount debit2=bank.openDebitAccount(child);

		debit1.deposit(20);
		//debit2.deposit(5);
		try {
			debit1.withdraw(15);
			debit2.withdraw(3);
		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
