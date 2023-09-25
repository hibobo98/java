/* 객체지향 05-05 , 06
 * 상속
 * 생성자 constructor
 */
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// 상속
class Dog extends Animal { 
    Dog() {}
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

// 매서드 오버라이딩
// 우선 순위 1. HouseDog 2.Dog
class HouseDog extends Dog{
    HouseDog(String name) { // 클래스 명과 동일, return 자료형을 생성하지 않는 매서드 = 생성자 
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

    // 매서드 오버로딩
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

        // 생성자 
        HouseDog dog = new HouseDog("무조건 입력해야함. 생성자를 만들었기 때문에");
        System.out.println(dog.name);

        // 생성자 오버로딩 
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire.name);
            
    
    }
}
