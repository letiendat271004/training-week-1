package Easy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (v1 <= v2) {
            return "NO";
        }

        if ((x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] input =
                bufferedReader.readLine().split(" ");

        int x1 = Integer.parseInt(input[0]);
        int v1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int v2 = Integer.parseInt(input[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);

        bufferedReader.close();
    }
}