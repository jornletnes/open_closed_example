package helloEnum;

public class EnumMain {

	public static void main(String[] args) {
		EnumHolder.Level myVar = EnumHolder.Level.MEDIUM;
		EnumRunner enumRunner = new EnumRunner();
		enumRunner.Run(myVar);
	}

}
