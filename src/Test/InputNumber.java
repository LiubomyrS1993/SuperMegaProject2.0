package Test;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputNumber {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        Integer integer = getNumber();
        System.out.println(integer);

        System.out.println("Continue...");

    }
    private static int getNumber(){
        try {
            System.out.println("Input number: ");
            String str = READER.readLine();
            return Integer.parseInt(str);

        } catch (Exception e) {
            System.out.println("Please input only numbers");
            return getNumber();

        }

    }

}
