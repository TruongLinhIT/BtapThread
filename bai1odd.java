package baitapthread;

public class bai1odd extends Thread {
	@Override
	public void run() {
		for (int i=1 ; i<=10;i++) {
			if (i%2!=0) {
				System.out.println("A="+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
