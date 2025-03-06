package baitapthread;

public class InterruptExample {
	public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Worker is running..."  );
                    Thread.sleep(500); // Ngủ 500ms mỗi vòng lặp
                } catch (InterruptedException e) {
                    System.out.println("Worker thread interrupted during sleep!");
                    break; // Thoát khỏi vòng lặp thay vì gọi lại interrupt()
                }
            }
            System.out.println("Worker stopped.");
        });

        worker.start();
        Thread.sleep(3000); // Chờ 3 giây trước khi dừng luồng
        System.out.println("Main thread: Interrupting worker thread...");
        worker.interrupt(); // Gửi tín hiệu dừng
        worker.join(); // Đợi worker kết thúc hoàn toàn
        System.out.println("Main thread: Worker has stopped. Exiting program.");
    }
}
