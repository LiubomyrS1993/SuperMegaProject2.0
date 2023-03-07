package Lesson4;

public class SecondHomeWork {

    public static void main(String[] args) {

        int foodPerCats = howMuchCatFoodPerMonth(8, 30, 3, 50);
        System.out.println("Cat food is needed per month: " + foodPerCats + " grams");

        int foodPerDogs = howMuchDogFoodPerMonth(24, 30, 3, 50);
        System.out.println("Dog food is needed per month :" + foodPerDogs + " grams");

        int foodCostPerMonth = howMuchMoneyNeedPerMonth(32, 30, 3, 2);
        System.out.println("The money is needed per month for the maintenance of the shelter: " + foodCostPerMonth + " $");

    }

    public static int howMuchCatFoodPerMonth(int cats, int daysInMonth, int threeTimesPerDay, int portion){
        int catsFoodMonth = portion * threeTimesPerDay * cats * daysInMonth;
        return catsFoodMonth;
    }

    public static int howMuchDogFoodPerMonth(int dogs, int daysInMonth, int threeTimesPerDay, int portion){
        int foodPerDogs = portion * threeTimesPerDay * dogs * daysInMonth;
        return foodPerDogs;
    }

    public static int howMuchMoneyNeedPerMonth(int dogsAndCats, int daysInMonth, int threeTimesPerDay, int cost){
        int moneyPerMonth = cost * threeTimesPerDay * dogsAndCats * daysInMonth;
        return moneyPerMonth;
    }
}

