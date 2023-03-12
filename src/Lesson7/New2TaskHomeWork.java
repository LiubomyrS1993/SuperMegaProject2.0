package Lesson7;

public class New2TaskHomeWork {

    public static void main(String[] args) {

        inputNumbersWithout4And9();
    }


    private static void inputNumbersWithout4And9() {
        for (int i = 0; i <= 100; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
                continue;
            }
            System.out.println(i);
        }
    }
}
