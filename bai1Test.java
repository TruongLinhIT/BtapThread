package baitapthread;

public class bai1Test {
	public static void main(String[] args) {
		bai1odd th1 = new bai1odd();
		bai1Even th2 = new bai1Even();
		th1.start();
		th2.start();
	}

}
