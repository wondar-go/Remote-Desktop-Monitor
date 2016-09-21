import ScreenCapture.screenCapture;
import Tray.Tray;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tray tray = new Tray();
		screenCapture sc = new screenCapture();
		Thread thread = new Thread(sc);
		thread.start();
	}

}
