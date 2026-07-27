public class object {
    String name;
    String color;

    void bark(){
        System.out.println(name + "is barking");
    }
    



    public static void main(String[] args){

      object dog1 = new object();

        dog1.name = "Tomy";
        dog1.color = "Brown";

        dog1.bark();

    }
}

