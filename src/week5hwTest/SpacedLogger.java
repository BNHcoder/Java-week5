package week5hwTest;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		String line = buildMessage(message);
		
		System.out.println(line);
	}
		
		private String buildMessage(String message) {		
			String line = "";
			
			for (int i =  0; i < message.length(); i++) {
				line += Character.toString(message.charAt(i)) + " ";
			}
			
			return line;
	}

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub
		
		System.out.println("ERROR: " + buildMessage(message));
		
	}

}
