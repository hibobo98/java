public class TestThread extends Thread {
    public void run() { // Thread를 상속하면 run 매서드를 구현해야 한다. 
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        TestThread th = new TestThread();
        th.start(); // start로 thread를 실행한다. 
    }
    
}


// https://wikidocs.net/230