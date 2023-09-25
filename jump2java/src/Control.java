import java.util.ArrayList;

public class Control {
    public static void main(String[] args) {
        boolean money = true;
        if (money) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라")
        }

        /*  연산자
         * x < y
         * x > y
         * x == y
         * x != y
         * x >= y
         * x <= y
         * x && y
         * x || y
         *  !x
         * */

        // contains
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타라");
        } else {
            System.out.println("걸어가라");
        }

        // else if

        // switch/case
        int month = 8;
        String monthString = "";
        switch (month) { // 입력 변수의 자료형은 byte, short, char, int, eum, String만 가능.
            case 1:
                monthString = "January";
                break;
            case 8:
                monthString = "August";
                break;
        }
        System.out.println(monthString);

        // while
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를" + treeHit + "번찍었습니다.");
            if (treeHit == 10){
                System.out.println("나무 넘어갑니다.");
            }
        }

        // continue
        int a = 0;
        while (a<10) {
            a++;
            if (a %2 ==0) {
                continue; //짝수인 경우 조건문으로 돌아간다
            }
            System.out.println(a);
        }

        // for
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번째 학생은 합격입니다."); // continue 쓰면 다시 for문으로 돌아감
            } else {
                System.out.println((i+1)+"번째 학생은 불합격입니다.");
            }
        }

        // 이중 for문
        for(int i = 2; i <10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println(""); // 줄 바꾸기
        }

        // for each문
//        String[] numbers = {"one", "two", "three"};
//        for (int i=0; i<numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        // ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(numbers);
        }



    }
}