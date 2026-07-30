abstract class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void sound();

}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
        d1.eat();
    }

}
