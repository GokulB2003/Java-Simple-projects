package animalSound;

public class Dog extends Animal{
	
//		String s;
//		String cat;
//		Dog(String s,String cat)
//		{
//			this.s=s;
//			this.cat=cat;
//			
//		}
	@Override
	void sound() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Bark");
	}

	@Override
	String category() {
		// TODO Auto-generated method stub
		return "pet";
	}

	
}
