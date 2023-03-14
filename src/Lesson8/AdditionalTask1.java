package Lesson8;

public class AdditionalTask1 {

    public static void main(String[] args) {
        tenOnTen();


        triangle();

    }

    private static void tenOnTen() {
        String x = "*";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(x);

            }
            System.out.println(x);
        }
    }

    private static void triangle() {
        String s = "#";
        for (int i = 0; i < 10; i++) {
            System.out.println(s);
            s += "#";
        }
    }
}
