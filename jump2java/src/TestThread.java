public class TestThread extends Thread {
    public void run() { // Thread�� ����ϸ� run �ż��带 �����ؾ� �Ѵ�. 
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        TestThread th = new TestThread();
        th.start(); // start�� thread�� �����Ѵ�. 
    }
    
}


// https://wikidocs.net/230