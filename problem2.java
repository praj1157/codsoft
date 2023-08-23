import java.util.Scanner;

public class problem2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int totalmarks = 0;
        for (int mark : marks) {
            totalmarks += mark;
        }

        System.out.println("Total marks = " + totalmarks);

        float avg = (float) totalmarks / marks.length;
        System.out.printf("Average percentage: %.2f%%%n", avg);

        boolean hasFailed = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 33) {
                System.out.println("Fail in subject " + (i + 1));
                hasFailed = true;
            }
        }

        if (!hasFailed) {
            if (totalmarks >= 80 && totalmarks <= 100) {
                System.out.println("Excellent");
            } else if (totalmarks >= 60) {
                System.out.println("Grade A");
            } else if (totalmarks >= 45) {
                System.out.println("Grade B");
            } else if (totalmarks >= 33) {
                System.out.println("Grade C");
            }
        } else {
            System.out.println("Overall Result: Fail");
        }
    }
}
