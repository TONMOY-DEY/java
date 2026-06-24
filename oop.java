
class calculator{

    public int add(int n1,int n2){
        int sum=n1+n2;
           return sum;
        
        //return 0;

    }
}


public class oop {
    public static void main(String[] args) {  

    calculator calc = new calculator();

    int result=calc.add(4, 5);
    System.out.println(result);
    }
    
}
