package Lab4_E;

import java.util.*;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Account[] checkingAccounts = new CheckingAccount[4];
		checkingAccounts[0] = new CheckingAccount("CH001", 15.00, 1000);
		checkingAccounts[1] = new CheckingAccount("CH002", 10.00, 1500);
		checkingAccounts[2] = new CheckingAccount("CH001", 15.00, 2000);
		checkingAccounts[3] = new CheckingAccount("CH002", 20.00, 900);
		Account[] savingsAccounts = new SavingsAccount[5];
		savingsAccounts[0] = new SavingsAccount("SA001", 0.1, 1200);
		savingsAccounts[1] = new SavingsAccount("SA002", 0.2, 1800);
		savingsAccounts[2] = new SavingsAccount("SA003", 0.15, 1400);
		savingsAccounts[3] = new SavingsAccount("SA002", 0.1, 800);
		savingsAccounts[4] = new SavingsAccount("SA003", 0.2, 700);
		
		
		Employee e1 = new Employee("Abrha");
		Employee e2 = new Employee("Saba");
		Employee e3 = new Employee("Peter");
		Employee e4 = new Employee("Baraki");
		
		e1.addAccount(checkingAccounts[0]);
		e1.addAccount(savingsAccounts[0]);
		
		e2.addAccount(checkingAccounts[1]);
		e2.addAccount(savingsAccounts[1]);
		
		e3.addAccount(savingsAccounts[2]);
		e3.addAccount(savingsAccounts[4]);

		e4.addAccount(savingsAccounts[3]);
		e4.addAccount(checkingAccounts[2]);
		e4.addAccount(checkingAccounts[3]);

		
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		System.out.println(Admin.computeUpdatedBalanceSum(employees));
		
		
	}

}
