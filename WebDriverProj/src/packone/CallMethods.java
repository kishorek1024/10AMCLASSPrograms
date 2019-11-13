package packone;

public class CallMethods {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.elementsCount("a", 50);
		m.elementsCount("img", 5);
		m.elementsCount("select", 3);
		m.elementAvailable("email", true);
		m.elementAvailable("pass", false);
		m.elementAvailable("day", true);
		m.elementAvailable("month", false);
		m.closeApp();
		m.launchApp("http://yahoomail.com");
		m.elementsCount("img", 10);
		m.closeApp();
		

	}

}
