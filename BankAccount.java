public class BankAccount{
	String username;
	String accountnumber;
	double balance;
	
	public BankAccount(){
		username="TONMOY";
		accountnumber="24-59325-3";
		balance=100.0;
	}
	public BankAccount(String xAccountnumber){
		username="TONMOY";
		accountnumber=xAccountnumber;
		balance=100.0;
	}
	public BankAccount(String xAccountnumber,String tree,double nbalance){
		username=tree;
		accountnumber=xAccountnumber;
		balance=nbalance;
		
	}
	public void showinfo(){
		System.out.println("username is:"+username);
		System.out.println("accountnumber is:"+accountnumber);
		System.out.println("balance:"+balance);
	}
}