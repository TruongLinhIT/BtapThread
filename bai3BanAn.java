package baitapthread;

import java.util.LinkedList;

public class bai3BanAn {
	final int CAPACITY = 5;
	final LinkedList<String> table = new LinkedList<>();
	int totalDishes = 0; 

    public synchronized void cook(String dish) throws InterruptedException {
        while (table.size() == CAPACITY) {
            wait(); 
        }
        table.add(dish);
        totalDishes++;
        System.out.println("Đầu bếp nấu: " + dish);
        notify(); 
    }

    public synchronized void eat() throws InterruptedException {
        while (table.isEmpty()) {
            wait(); 
        }
        String dish = table.removeFirst();
        System.out.println("Khách hàng ăn: " + dish);
        notify();  
        
    }
    public int gerTotalDishes() {
    	return this.totalDishes;
    }
}

