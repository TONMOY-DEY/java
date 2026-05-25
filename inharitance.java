import java.util.Scanner;
public class Array{
	public static void main(String args[]){
		double  num[]=new double[5];
		Scanner S1=new Scanner(System.in);
		
		for(int i=0;i<num.length;i++){
			num[i]=S1.nextDouble();
		}
		double min=num[0];
		double max=num[0];
		for(int i=0;i<num.length;i++){
			if(num[i]<min){
				min=num[i];
			}
			if(num[i]>max){
				max=num[i];
			}
			System.out.println("min value:"+min);
			System.out.println("max value:"+max);
		System.out.println("Enter a: ");
		double a=S1.nextDouble();
	System.out.println("Enter b: ");
	double b=S1.nextDouble();
	
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	 System.out.println("Array values are: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

	}
}
	
		
		