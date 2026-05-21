package Easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

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

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput =
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);
        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput =
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);
        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput =
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);
        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples =
                Stream.of(
                                bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

        List<Integer> oranges =
                Stream.of(
                                bufferedReader.readLine()
                                        .replaceAll("\\s+$", "")
                                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

        countApplesAndOranges(
                s,
                t,
                a,
                b,
                apples,
                oranges);

        bufferedReader.close();
    }
}