package $2BankAccountAppPractise;

public class $3SavingAccount extends $2BankAccount { // extends is a keyword which can inherit the
	// class object and use itself
	String accountType;
	double totalAmount;

	void totalBalance(int withdraw) {
		System.out.println("Balance Left : " + (totalAmount - withdraw));
	}
}
