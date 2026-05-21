package Easy1;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {

            int grade = grades.get(i);

            // Chỉ làm tròn nếu >= 38
            if (grade >= 38) {

                // Bội số tiếp theo của 5
                int nextMultiple = ((grade / 5) + 1) * 5;

                // Nếu chênh lệch < 3 thì làm tròn
                if (nextMultiple - grade < 3) {
                    grades.set(i, nextMultiple);
                }
            }
        }

        return grades;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(sc.nextInt());
        }

        List<Integer> result = gradingStudents(grades);

        for (int grade : result) {
            System.out.println(grade);
        }

        sc.close();
    }
}