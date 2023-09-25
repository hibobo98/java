/* 객체 지향 05-02 ~ 03
 * 클래스
 * 매서드 
 */

public class OOP2 {
    // 1
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은"+nick+"입니다.");
    }
    // 2
    int sum(int a, int b) { // a,b 는 매개변수 
        return a+b; 
    }

    // 3-1
    void varTest(int a) {
        a++;
    }

    // 3-2
    int varTest2(int a) { // "값"을 전달
        a++;
        return a;
    }

    // 3-3
    int aaa;
    void varTest3(OOP2 sample) { //OOP2 클래스의 sample "객체"를 전달 
        sample.aaa++;
    }

    void varTest4(){
        this.aaa++;
    }

    public static void main(String[] args) { 
        OOP2 sample = new OOP2();

        // 1
        sample.sayNick("야호");
        sample.sayNick("바보"); // 출력되지 않는다. 

        // 2
        int c = sample.sum(3, 4); // 3, 4는 인수 
        System.out.println(c);

        // 3-1
        int a = 1;
        sample.varTest(a);
        System.out.println(a); // a++가 적용되지 않아서, 1이 출력됨 

        // 3-2
        int aa = 1; 
        a = sample.varTest2(aa);
        System.out.println(a);
        
        // 3-3
        sample.aaa = 1;
        sample.varTest3(sample);
        System.out.println("varTest3은"+sample.aaa);

        sample.varTest4();
        System.out.println("varTest4는"+sample.aaa);
        
    }
    
}
