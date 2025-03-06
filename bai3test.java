package baitapthread;

public class bai3test {
	public static void main(String[] args) {
		bai3BanAn table = new bai3BanAn();
        bai3Chef chef = new bai3Chef(table);
        bai3Customer customer = new bai3Customer(table);
        chef.start();
        customer.start();
        
	}
}
