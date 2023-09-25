/* 7¿Â Static */
class HouseLee {
    static String lastname = "¿Ã";
}

// class Counter {
//     int count = 0;
//     Counter() {
//         this.count++;
//         System.out.println(this.count);
//     }
// }

class Counter {
    static int count = 0;
    Counter() {
        count++;
        System.out.println(count);
    }
}


public class Static {
    public static void main(String[] args) {
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
    }
}
