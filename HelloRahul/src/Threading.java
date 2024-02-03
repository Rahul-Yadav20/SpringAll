
class Thread1 extends Thread {

	public void run() {
		int a=0;
		while (a<50) {
			System.out.println("Thread1 is running..");
			a++;
		}
	}
}

class Thread2 extends Thread {

	public void run() {
		int a=0;
		while (a<50) {
			System.out.println("Thread2 is running..");
			
		}
	}
}

public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
