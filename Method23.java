class computer{
    public void playmusic(){
        System.out.println("Music playing.....");
    }

    public String getpen(int cost){
        if(cost>10)
        return "pen";
    
    else 
        return "Nothing";
}
    
}

public class Method23 {
    public static void main(String[] args) {
        computer co=new computer();
        co.playmusic();
        co.getpen(2);
        System.out.println(co.getpen(2));
    }
    
}

