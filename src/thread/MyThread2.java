package thread;

public class MyThread2 implements Runnable{
	
	public MyThread2() {
		Thread thread = new Thread(this);
		thread.start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "Hello";
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
