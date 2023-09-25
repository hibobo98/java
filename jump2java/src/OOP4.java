/* ��ü���� 05-05 , 06
 * ���
 * ������ constructor
 */
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// ���
class Dog extends Animal { 
    Dog() {}
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

// �ż��� �������̵�
// �켱 ���� 1. HouseDog 2.Dog
class HouseDog extends Dog{
    HouseDog(String name) { // Ŭ���� ��� ����, return �ڷ����� �������� �ʴ� �ż��� = ������ 
        this.setName(name);
    }

    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + "zzz in house");
    }

    // �ż��� �����ε�
    void sleep(int hour) {
        System.out.println(this.name + "zzz in house for " + hour + " ours");
    }

}

public class OOP4 {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.setName("poppy");
        // System.out.println(dog.name);
        // dog.sleep(); 

        // HouseDog houseDog = new HouseDog();
        // houseDog.setName("happy");
        // houseDog.sleep();
        // houseDog.sleep(5);

        // ������ 
        HouseDog dog = new HouseDog("������ �Է��ؾ���. �����ڸ� ������� ������");
        System.out.println(dog.name);

        // ������ �����ε� 
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire.name);
            
    
    }
}
