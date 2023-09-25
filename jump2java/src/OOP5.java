/* ��ü���� 05-07, 08, 09
 * �������̽�
 * ������ 
 * �߻�Ŭ���� 
*/
abstract class Predator extends Animal {
    abstract String getFood();

    void printFood() { // default�� ���� : �߻�Ŭ���� 
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable {
    void bark();
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name; 
    }
}

class Tiger extends Predator implements Barkable{
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("����");
    }
}
class Lion extends Predator implements Barkable{
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("������");
    }
}

class ZooKeeper{
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
        predator.printFood();
    }
    // void feed(Tiger tiger) {
    //     System.out.println("��� �Ծ��");
    // }

    // void feed(Lion lion) {
    //     System.out.print("�ٳ��� ����!");
    // }
}

class Bouncer{
    void barkAnimal(Barkable animal) {
        animal.bark();
        // if (animal instanceof Tiger) {
        //     System.out.println("����");
        // } else if (animal instanceof Lion) {
        //     System.out.println("������");
        // }
    }
}

public class OOP5 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
    
}
