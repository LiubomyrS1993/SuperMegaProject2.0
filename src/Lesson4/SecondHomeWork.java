package Lesson4;

public class SecondHomeWork {

    public static void main(String[] args) {

        int foodPerCats = howMuchCatFoodPerMonth();
        System.out.println("Cat food is needed per month: " + foodPerCats + " grams");

        int foodPerDogs = howMuchDogFoodPerMonth();
        System.out.println("Dog food is needed per month :" + foodPerDogs + " grams");

        int foodCostPerMonth = howMuchMoneyNeedPerMonth();
        System.out.println("The money is needed per month for the maintenance of the shelter: " + foodCostPerMonth + " $");

    }

    public static int howMuchCatFoodPerMonth(){
        int cats = 8;
        int daysInMonth = 30;
        int threeTimesPerDay = 3;
        int portion = 50;
        int catsFoodMonth = portion * threeTimesPerDay * cats * daysInMonth;

        return catsFoodMonth;
    }

    public static int howMuchDogFoodPerMonth(){
        int dogs = 24;
        int daysInMonth = 30;
        int threeTimesPerDay = 3;
        int portion = 50;
        int foodPerDogs = portion * threeTimesPerDay * dogs * daysInMonth;

        return foodPerDogs;
    }

    public static int howMuchMoneyNeedPerMonth(){
        int dogsAndCats = 24 + 8;
        int daysInMonth = 30;
        int threeTimesPerDay = 3;
        int cost = 2;
        int moneyPerMonth = cost * threeTimesPerDay * dogsAndCats * daysInMonth;

        return moneyPerMonth;
    }
}

