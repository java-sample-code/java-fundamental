package thread;

public class Run {
	public static void main(String[] args) {
//		MyThread2 t1 = new MyThread2();
//		MyThread2 t2 = new MyThread2();
//		MyThread t2 = new MyThread();
//		t2.setName("T2");
//		t2.start();
		Process process = new Process();
		ProcessThread p1 = new ProcessThread(process, "First");
		ProcessThread p2 = new ProcessThread(process, "Second");
		ProcessThread p3 = new ProcessThread(process, "Third");
		
	}
}
