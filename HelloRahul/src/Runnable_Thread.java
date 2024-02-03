
class MyThread1 implements Runnable{
	public void run() {
		int i = 0;
		while(i<50) {
			System.out.println("Thread1 using runnable interface");
			i++;
		}
	}
}
class MyThread2 implements Runnable{
	public void run() {
		int i = 0;
		while(i<50) {
			System.out.println("Thread2 using runnable interface");
			i++;
		}
	}
}
public class Runnable_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 bullet1 = new MyThread1();
		Thread gun1 = new Thread(bullet1);
		
		MyThread2 bullet2 = new MyThread2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();
	}

}
