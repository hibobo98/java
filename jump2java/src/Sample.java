// 자바의 기초 자료형
public class Sample {
    public static void main(String[] args) {
        System.out.println(7 % 3);
        System.out.println(3 % 7);

        int i = 0;
        int j = 10;

        i++;
        j--;

        System.out.println(i);
        System.out.println(j);

        /* 자료형 1 - 숫자 */
        System.out.println(i++);  // 값을 참조한 후에 증가
        System.out.println(++i);  // 값을 참조하기 전에 증가

        /* 자료형 2 - Boolean */
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }

        int k = 3;
        boolean isOdd = k % 2 == 1;
        System.out.print(isOdd);

        /* 자료형 3 - 문자 */
        char a1 = 'a';

        /* 자료형 4 - 문자열 */
        String a = "Happy Java"; // 리터럴 방식
        String b = new String("Happy Java"); // 새로운 객체를 만든다.
        System.out.println(a.equals(b)); // 문자열 비교할 때는  반드시 equals 사용
        System.out.println(a == b); // a와 b 안의 내용은 같지만 다른 객체임. ==는 같은 객체인지 비교하는 연산자

        // indexOf
        System.out.println(a.indexOf("Java"));

        // contains
        System.out.println(a.contains("Java"));

        // charAt
        System.out.println(a.charAt(6));

        // replaceAll
        System.out.println(a.replaceAll("Java", "Bowon"));

    }
}
