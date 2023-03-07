package Lesson3;

public class Lesson3FirstHomeWork {

    public static void main(String[] args) {

      double firstLayer = 4.0/3.0 * Math.PI * 1.0;
      double secondLayer = 4.0/3.0 * Math.PI * Math.pow(0.5, 3.0);
      double thirdLayer = 4.0/3.0 * Math.PI * Math.pow(0.2, 3.0);

      double result = firstLayer * 0.7 + secondLayer * 0.7 + thirdLayer * 0.7;

      System.out.println("Snowman weigh is: " + result);
    }

}
