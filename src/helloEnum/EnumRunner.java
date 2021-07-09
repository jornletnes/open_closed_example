package helloEnum;

public class EnumRunner {
	
	public void Run(EnumHolder.Level level) {
		switch(level) {
		case HIGH:
			System.out.println("Stop doing this thing! It is dangerous!");
			break;
		case MEDIUM:
			System.out.println("You may or may not do this thing - I don't particularly care.");
			break;
		case LOW:
			System.out.println("Do this thing; don't worry about it, it's totally safe.");
			break;
		default:
			System.out.println("It is not possible to do this thing");
			break;
		}
	}

}
