class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];

        for (int i = 0; i < logs.length; i++) {
            int[] log = logs[i];

            int birth = log[0];
            int death = log[1];

            for(int years=birth;years<death;years++){
                population[years-1950]++;
            }
        }
        int max = 0;
        int year = 1950;

        for (int i = 0; i < 101; i++) {
            if (population[i] > max) {
                max = population[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}