package thread;

public class Process {
	public void showMessage(String message) {
		
		synchronized (this) {
			System.out.println(message);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
