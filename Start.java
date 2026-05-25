public class Start{
	public static void main (String args[]){
		BankAccount b1=new BankAccount("24-59325-3");
		BankAccount b2=new BankAccount("24-59325-3","tree",50000.0);
		b1.showinfo();
		System.out.println();
		b2.showinfo();
	}
}