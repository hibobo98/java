/* ��ü ���� 05-02 ~ 03
 * Ŭ����
 * �ż��� 
 */

public class OOP2 {
    // 1
    void sayNick(String nick) {
        if ("�ٺ�".equals(nick)) {
            return;
        }
        System.out.println("���� ������"+nick+"�Դϴ�.");
    }
    // 2
    int sum(int a, int b) { // a,b �� �Ű����� 
        return a+b; 
    }

    // 3-1
    void varTest(int a) {
        a++;
    }

    // 3-2
    int varTest2(int a) { // "��"�� ����
        a++;
        return a;
    }

    // 3-3
    int aaa;
    void varTest3(OOP2 sample) { //OOP2 Ŭ������ sample "��ü"�� ���� 
        sample.aaa++;
    }

    void varTest4(){
        this.aaa++;
    }

    public static void main(String[] args) { 
        OOP2 sample = new OOP2();

        // 1
        sample.sayNick("��ȣ");
        sample.sayNick("�ٺ�"); // ��µ��� �ʴ´�. 

        // 2
        int c = sample.sum(3, 4); // 3, 4�� �μ� 
        System.out.println(c);

        // 3-1
        int a = 1;
        sample.varTest(a);
        System.out.println(a); // a++�� ������� �ʾƼ�, 1�� ��µ� 

        // 3-2
        int aa = 1; 
        a = sample.varTest2(aa);
        System.out.println(a);
        
        // 3-3
        sample.aaa = 1;
        sample.varTest3(sample);
        System.out.println("varTest3��"+sample.aaa);

        sample.varTest4();
        System.out.println("varTest4��"+sample.aaa);
        
    }
    
}
