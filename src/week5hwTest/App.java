package week5hwTest;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger starMessage = new AsteriskLogger();
		starMessage.Log("Luke I am your Father");
		System.out.println();
		starMessage.Error("Luke I am your Father");
		
		
		System.out.println();
		System.out.println();
		
		Logger spacedMessage = new SpacedLogger();
		spacedMessage.Log("Luke I am your Father");
		System.out.println();
		spacedMessage.Error("Luke I am your Father");

	}

}
