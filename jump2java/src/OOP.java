/* ��ü���� 05-01 */
class Animal {
    String name;

    /* setName �ż��� */
    public void setName(String name) { // void = ���ϰ� ����. 
        this.name = name; // this = Animal�� �ν��Ͻ��� cat�� �ǹ� 
    }

}

public class OOP {
    public static void main(String[] args) {
        Animal cat = new Animal(); 
        cat.setName("body");
        // cat�� ��ü 
        // cat�� Animal�� �ν��Ͻ� 
        System.out.println(cat.name);

    }
    
}
