package ru.netology;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
       int[][] teams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /**
     * Метод для слияния всех команд в одну национальную
     */
    public static int[] mergeAll(int[][] teams) {
        for (int i = 1; i < teams.length; i++) {
            teams[0] = merge(teams[0], teams[i]);
        }
        return teams[0];
    }

    /**
     * Метод для слияния двух команд в одну
     */
    public static int[] merge(int[] teamA, int[] teamB) {
        int teamC[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int posA = 0;
        int posB = 0;
        for (int i = 0; i < 10; i++) {
            if (teamA[i - posA] > teamB[i - posB]) {
                teamC[i] = teamA[i - posA];
                posB++;
            }
            else {
                teamC[i] = teamB[i - posB];
                posA++;
            }
        }
        return teamC;
    }
}