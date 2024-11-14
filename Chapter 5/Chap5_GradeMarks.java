import java.util.Scanner;

public class Chap5_GradeMarks {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input marks
        int[] marks = getMarks(scanner);

        // Step 2: Determine grades
        char[] grades = new char[marks.length];
        for (int i = 0; i < marks.length; i++) {
            grades[i] = determineGrade(marks[i]);
        }

        // Step 3: Count grades
        int[] gradeCounts = countGrades(grades);

        // Step 4: Display results
        displayResults(gradeCounts);

        scanner.close();
    }

    // Method to input 10 marks from the user
    public static int[] getMarks(Scanner scanner) {
        int[] marks = new int[10];
        System.out.println("Enter 10 marks (0-100):");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
            // Basic validation to ensure mark is between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark. Please enter a value between 0 and 100:");
                marks[i] = scanner.nextInt();
            }
        }
        return marks;
    }

    // Method to determine the grade based on the mark
    public static char determineGrade(int mark) {
        if (mark >= 90) return 'A';
        if (mark >= 80) return 'B';
        if (mark >= 70) return 'C';
        if (mark >= 60) return 'D';
        return 'E';
    }

    // Method to count occurrences of each grade
    public static int[] countGrades(char[] grades) {
        int[] counts = new int[5]; // Array to hold counts for grades A, B, C, D, E
        for (char grade : grades) {
            switch (grade) {
                case 'A': counts[0]++; break;
                case 'B': counts[1]++; break;
                case 'C': counts[2]++; break;
                case 'D': counts[3]++; break;
                case 'E': counts[4]++; break;
            }
        }
        return counts;
    }

    // Method to display the results
    public static void displayResults(int[] counts) {
        System.out.println("\nOut of 10:");
        System.out.println("Grade A: " + counts[0]);
        System.out.println("Grade B: " + counts[1]);
        System.out.println("Grade C: " + counts[2]);
        System.out.println("Grade D: " + counts[3]);
        System.out.println("Grade E: " + counts[4]);
    }
}
