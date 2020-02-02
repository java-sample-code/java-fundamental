package thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(this.getName() + ":"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();
	}
	
}
