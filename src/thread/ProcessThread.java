package thread;

public class ProcessThread implements Runnable{

	private String message;
	private Process process;
	Thread thread;
	
	public ProcessThread(Process process, String message) {
		this.process = process;
		this.message = message;
		thread = new Thread(this);
		thread.start();
	}
	
	
	@Override
	public void run() {
		process.showMessage(this.message);
	}
}
