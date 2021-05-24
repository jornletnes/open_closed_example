package helloPolymorphism;

public class PolymorphicMain {

	public static void main(String[] args) {
		ILevel myVar = new LevelLow();
		PolymorphicRunner enumRunner = new PolymorphicRunner();
		enumRunner.Run(myVar);
	}

}
