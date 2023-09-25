/* 객체지향 05-01 */
class Animal {
    String name;

    /* setName 매서드 */
    public void setName(String name) { // void = 리턴값 없음. 
        this.name = name; // this = Animal의 인스턴스인 cat을 의미 
    }

}

public class OOP {
    public static void main(String[] args) {
        Animal cat = new Animal(); 
        cat.setName("body");
        // cat은 객체 
        // cat은 Animal의 인스턴스 
        System.out.println(cat.name);

    }
    
}
