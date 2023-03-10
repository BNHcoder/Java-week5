package week5hwTest;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		String line = buildMessage(message);
		System.out.println(line);

	}

	private String buildMessage(String message) {
		String line = "***" + message + "***";
		return line;
	}

	@Override
	public void Error(String message) {
		// TODO Auto-generated method stub

		String line = buildMessage(message);
		String border = "";
		for (int i = 0; i < line.length(); i++) {
			border += "*";
		}
		
		System.out.println(border);
		System.out.println(line);
		System.out.println(border);
		
	}

}
