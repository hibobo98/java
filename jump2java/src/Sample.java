// 자바의 기초 자료형
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

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

        // substring
        System.out.println(a.substring(0, 4));  // (시작위치, 끝위치) 0~3까지

        // toUpperCase
        System.out.println(a.toUpperCase());

        //split
        String v = "a:b:c:d";
        String[] result = v.split(":"); // result => {"a", "b", "c", "d"}
        // 왜 프린트 안했징?

        // String.format
        System.out.println(String.format("I eat %d apples.", 3));
        System.out.println(String.format("I eat %s apples.", "five"));

        int number = 55;
        System.out.println(String.format("I eat %d apples.", number));

        String day = "three";
        System.out.println(String.format("I ate %d apples. So I was sick for %s days.", number, day));

        /*
        * %s 문자열 String
        * %c 문자 1개 Character
        * %d 정수 int
        * %f 부동소수 float
        * %o 8진수
        * %x 16진수
        * %% Literal % (문자 % 자체)
        * */
        System.out.println(String.format("I have %s apples", 3));
        System.out.println(String.format("rate is %s", 3.231));
        System.out.println(String.format("Error is %d%%", 50)); // %%

        // 정렬과 공백
        System.out.println(String.format("%10s", "hi")); // 총 10칸 안에 hi포함 - 공백은 8칸
        System.out.println(String.format("%-10sjane.", "hi")); // 총 10칸안에 hi 포함 - 공백 8칸 - jane은 10칸에 안 포함

        // 소수점 표현하기
        System.out.println(String.format("%10.4f", 3.4123423)); // 전체 10칸에 소숫점 4자리까지

        // System.out.printf 문자열을 출력하는 매서드 // String.format 문자열을 리턴하는 매서드
        System.out.printf("I eat %d apples.", 3);

        /* 자료형 - 5 StringBuffer */
        // 1) 객체를 한 번만 생성
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String resultb = sb.toString();
        System.out.println(resultb);

        // 2) resultbb라는 객체를 여러번 생성
        String resultbb = "";
        resultbb += "hello";
        resultbb += " ";
        resultbb += "jump to java";
        System.out.println(resultbb);
        // String 자료형은 변경 될 수 없다. 여러 개를 다시 만드는 것. immutable
        // Stringbuffer는 변경될 수 있다. mutable
        // StringBuilder 동기화 고려할 필요 없는 상황. StringBuffer 동기화 고려해야하는 상황

        //insert
        StringBuffer sbb = new StringBuffer();
        sbb.append("jump to java");
        sbb.insert(0, "hello");
        System.out.println(sb.toString());

        /* 자료형 6 - 배열 */
        int[] odds = {1, 3, 5, 7, 9};
        String[] week = {"월","화", "수", "목", "금", "토", "일"};
        // 배열 = 자료형의 종류 X 자료형의 집합 O

        // 6-1 배열의 길이 설정
        String[] weeks = new String[7]; // 길이 없으면 오류 발생
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        // 6-2 배열값에 접근하기
        System.out.println(weeks[3]);

        // 6-3 배열의 길이 구하기
        for (int z = 0; z < weeks.length; z++) {
            System.out.println(weeks[z]);
        }

        /* 자료형 7 - 리스트 */
        // add
        ArrayList pitches = new ArrayList();
        pitches.add("128");
        pitches.add("127");
        pitches.add("111");
        pitches.add(1, "333"); // 원래 1자리에 있던 애는 뒤로 밀려난다.
        System.out.println(pitches);

        // get
        System.out.println(pitches.get(1));

        // size
        System.out.println(pitches.size());

        // contains
        System.out.println(pitches.contains("142"));

        // remove(객체) or remove(인덱스)
        System.out.println(pitches.remove("129")); // 삭제 후, T F
        System.out.println(pitches.remove(0)); // 삭제 후, 값

        // generics
        ArrayList<String> pitchess = new ArrayList<>();
        pitchess.add("128");
        pitchess.add("456");

        String one = pitchess.get(0);
        String two = pitchess.get(1);

        String[] data = {"123", "452", "111"}; // 배열
        ArrayList<String> pitch = new ArrayList<>(Arrays.asList(data));
//        ArrayList<String> pitch = new ArrayList<>(Arrays.asList("123", "234", "999"));
        System.out.println(pitch);

        // String.join
//        String res = "";
//        for (int r = 0; r < pitch.size(); r++) {
//            res += pitches.get(r);
//            res += ",";
//        }
//        res = res.substring(0, res.length() - 1); // 마지막 콤마 제거
//        System.out.println(res);

        String res = String.join(",", pitch); // 하나의 문자열
        System.out.println(res);

        // 리스트 정렬
        pitch.sort(Comparator.naturalOrder()); // 오름차순
        pitch.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(pitch);

        /* 자료형 - 8 맵 */
        // HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구"); // String만 사용할 수 있음.
        System.out.println(map); // {baseball=야구, people=사람}

        // get
        System.out.println(map.get("people"));
        System.out.println(map.get("java"));
        System.out.println(map.getOrDefault("java", "tongtong"));

        // containsKey



    }
}
