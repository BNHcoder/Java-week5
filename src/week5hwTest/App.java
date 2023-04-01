package week5hwTest;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger starMessage = new AsteriskLogger();
		starMessage.Log("Hello");
		System.out.println();
		starMessage.Error("Hello");
		
		
		System.out.println();
		System.out.println();
		
		Logger spacedMessage = new SpacedLogger();
		spacedMessage.Log("Hello");
		System.out.println();
		spacedMessage.Error("Hello");

	}

}
