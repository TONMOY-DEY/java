
class calculator56{
    public int add(int n1,int n2,int n3){
        int result=n1+n2+n3;
        return result;
    }

 
}

public class calculator{
    public static void main(String[] args) {
        calculator56 cal=new calculator56();
        cal.add(3, 4,5);
        System.out.println(cal.add(3, 4,5));
    }
    
}
