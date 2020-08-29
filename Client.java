import oui.*;

public class Client {

	public static void main(String[] args) throws Exception {
        // javac Client.java
        // java Client C:/BtreePage
        DataManager.basedir = args[0];
		App app = new App();
	}
}