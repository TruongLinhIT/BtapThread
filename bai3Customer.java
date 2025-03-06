package baitapthread;

public class bai3Customer extends Thread {
	private final bai3BanAn table;

    public bai3Customer(bai3BanAn table) {
        this.table = table;
    }

    @Override
    public void run() {
        try {
        	int dishesEaten = 0;
            while (dishesEaten<5) {
                table.eat();
                Thread.sleep(3000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
