interface Animal {
    void sound(); 
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Bark");
    }

    public static void main(String[] args) {
       Cat cat=new Cat();
        cat.sound();
    }
}