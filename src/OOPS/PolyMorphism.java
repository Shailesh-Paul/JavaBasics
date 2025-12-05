package OOPS;

public class PolyMorphism {
    public static  class  Dog{
        void speak(){
            System.out.println("Bhaw Bhaw");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pikachu");
        }
    }
    public static  class Human{
        void speak(){
            System.out.println("Hello Dosto");
        }

    }
    public static void main(String[] args) {
        Human h= new Human();
        Pikachu p= new Pikachu();
        Dog d= new Dog();
        Cat c= new Cat();



        h.speak();
        c.speak();
        d.speak();
        p.speak();
    }
}
