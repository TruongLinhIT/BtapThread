package baitapthread;

public class bai1RaceCondition {
	
	int count = 0;
	synchronized void increament() {
		count++;
	}
	
	public int getCount() {
		return this.count;
	}

	
	public static void main(String[] args) throws InterruptedException {
		bai1RaceCondition count = new bai1RaceCondition();
		Thread t1 = new Thread(() ->{
			for (int i=0;i<1000;i++) {
				count.increament();
				}
			System.out.println(count.getCount());
			});
		Thread t2 = new Thread(() ->{
			for (int i=0;i<1000;i++) {
				count.increament();
				}
			System.out.println(count.getCount());
		});
		
		t1.start();
		t1.join();
		t2.start();
	}
}
