package baitapthread;

public class bai3Chef extends Thread {
	private final bai3BanAn table;
    private int dishNumber = 1;

    public bai3Chef(bai3BanAn table) {
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while (dishNumber<=5) {
                table.cook("Món " + dishNumber++);
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
