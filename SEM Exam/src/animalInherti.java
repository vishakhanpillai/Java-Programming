class Animal{
	
	void makeSound() {
		System.out.println("Some Generic Sound");
	}
	
}

class dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog: Bow Bow");
	}
}

class cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat: Meow Meow");
	}
}

class cow extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cow: Moo Moo");
	}
}


public class animalInherti {
public static void main(String[] args) {
	
	Animal animal = new Animal();
	cat cat = new cat();
	dog dog = new dog();
	cow cow = new cow();
	
	
	animal.makeSound();
	cat.makeSound();
	cow.makeSound();
	dog.makeSound();
}
}
