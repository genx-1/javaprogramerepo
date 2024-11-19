package polymorphysm;

public class Main {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object 
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound(); //animal make asound
	    myPig.animalSound();  //pig sys wee wee
	    myDog.animalSound();  //dog sys wo wo

	}

}
