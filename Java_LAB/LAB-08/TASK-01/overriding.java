class Animal{
    void sound(){
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class overriding {
    public static void main(String[] args) {
      Animal s = new Animal();
      Animal s1 = new Dog();
      Animal s2 = new Cat();
    
      s.sound();
      s1.sound();
      s2.sound();

    }
}
