public class Parse {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        int nn = 123;
        String numm = ""+ nn;
        System.out.println(numm);

        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        System.out.println(num1);
        System.out.println(num2);

        String num5 = "123.456";
        double d = Double.parseDouble(num5);
        System.out.println(d);

        // 정수 <-> 실수
        int n1 = 123;
        double d1 = n1; // 캐스팅 안 해줌
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int) d2; // 캐스팅 해줌
        System.out.println(n2);

        // final
        final int nnnn = 123; // - 바꿀 수 없다. (재할당 불가능)
        // nnnn = 6; // 오류 발생

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d")); // 오류 발생 (재할당 불가능)

        final List<String> a = List.of("a", "b");
        // a.add("c") // 오류 발생




    }
}
