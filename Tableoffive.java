class TableOfFiveThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class Tableoffive {
    public static void main(String[] args) {
        TableOfFiveThread thread = new TableOfFiveThread();
        thread.start();
}
}
