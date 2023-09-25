/* 객체지향 05-04
 * 값에 의한 호출과 객체에 의한 호출 
 */
class Updater {
    void update(int count) {
        count++;
    }

    void update2(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0;
}

public class OOP3 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count); // 출력 : 0 
        Updater myUpdater = new Updater();
        // myupdater.update(myCounter.count); // 출력 : 0
        myUpdater.update2(myCounter); // 출력 : 1
        System.out.println("after update:"+myCounter.count);
    }
    
}
