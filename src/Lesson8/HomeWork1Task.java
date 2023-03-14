package Lesson8;

import java.util.Random;

public class HomeWork1Task {


    public static void main(String[] args) {
        Random rand = new Random();
        int[] firstTeamPlayers = new int[11];
        int[] secondTeamPlayers = new int[11];

        System.out.println("Footballer's first team age: ");
        countRandomAge(firstTeamPlayers, rand);
        System.out.println(" ");
        System.out.println("Footballer's second team age: ");
        countRandomAge(secondTeamPlayers, rand);
        System.out.println(" ");
        double team1AvgAge = 0;
        team1AvgAge = getTeamAvgAge(firstTeamPlayers);
        double team2AvgAge = getTeamAvgAge(secondTeamPlayers);
        countWhichTeamHasBiggerAVGAge(team1AvgAge, team2AvgAge);


    }

    private static void countWhichTeamHasBiggerAVGAge(double team1AvgAge, double team2AvgAge) {
        if (team1AvgAge > team2AvgAge) {
            System.out.println("Team 1 has a higher average age: " + team1AvgAge);
        } else if (team2AvgAge > team1AvgAge) {
            System.out.println("Team 2 has a higher average age: " + team2AvgAge);
        } else {
            System.out.println("Both teams have the same average age: " + team1AvgAge);
        }
    }

    private static void countRandomAge(int[] firstTeamPlayers, Random rand) {
        for (int i = 0; i < firstTeamPlayers.length; i++) {
            firstTeamPlayers[i] = rand.nextInt(28) + 18;
            System.out.print(firstTeamPlayers[i]);
            if (i < firstTeamPlayers.length - 1) {
                System.out.print(", ");

            }
        }
    }

    private static double getTeamAvgAge(int[] firstTeamPlayers) {
        double team1AvgAge = 0;
        for (int i = 0; i < firstTeamPlayers.length; i++) {
            team1AvgAge = firstTeamPlayers[i] + team1AvgAge;

        }
        return team1AvgAge / firstTeamPlayers.length;
    }
}




