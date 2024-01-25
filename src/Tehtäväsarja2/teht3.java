package Tehtäväsarja2;

import java.util.Random;

public class teht3 {
    private static int[] ages = {18, 19, 20, 21, 22, 23, 24, 25, 26};
    private static int[] percentages = {10, 20, 25, 18, 8, 15, 22, 7, 14};
    private static int[] distribution = new int[ages.length];
    private static Random random = new Random();

    static {
        int Percent = 0;
        for (int i = 0; i < percentages.length; i++) {
            Percent += percentages[i];
            distribution[i] = Percent;
        }
    }
    public static void main(String[] args) {
        int[] ageCounts = new int[ages.length];
        for (int i = 0; i < 1000; i++) {
            int age = getRandomAgeIndex();
            ageCounts[age]++;
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ikä " + ages[i] + " Lukumäärä " + ageCounts[i]);
        }
    }
    private static int getRandomAgeIndex() {
        int randomprocent = random.nextInt(101);
        for (int i = 0; i < distribution.length; i++) {
            if (randomprocent <= distribution[i]) {
                return i;
            }
        }
        return -1;
    }
}
