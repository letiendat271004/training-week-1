package Easy2;


import java.util.*;


class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER s
     * 2. INTEGER t
     * 3. INTEGER a
     * 4. INTEGER b
     * 5. INTEGER_ARRAY apples
     * 6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(
            int s,
            int t,
            int a,
            int b,
            List<Integer> apples,
            List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for (int apple : apples) {
            int position = a + apple;

            if (position >= s && position <= t) {
                appleCount++;
            }
        }

        for (int orange : oranges) {
            int position = b + orange;

            if (position >= s && position <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}