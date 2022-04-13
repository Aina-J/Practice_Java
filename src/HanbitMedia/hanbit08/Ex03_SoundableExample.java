package HanbitMedia.hanbit08;
public class Ex03_SoundableExample {
	
	private static void printSound(Ex03_Soundable soundable) { 
		System.out.println(soundable.sound()); 
	} 
	
	public static void main(String args[]) { 
		printSound(new Ex03_Cat()); 
		printSound(new Ex03_Dog()); 
	} 

}

