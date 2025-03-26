class Animal{
    void makeSound(){
        System.out.println("Animal making sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bow bow");
    }
}


public class instance {
    public static void main(String[] args) {
        
        Animal a = new Dog();

        if(a instanceof Dog){
            Dog dog = (Dog) a;
            dog.bark();
        }



        

    }
}
