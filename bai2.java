package baitapthread;

public class bai2 extends Thread{
	@Override
	public void run() {
		for (int i=10;i>=0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		bai2 th1 = new bai2();
		th1.start();
	}

}
