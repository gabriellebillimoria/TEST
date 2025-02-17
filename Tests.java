import java.util.Scanner;

public class Tests {
    private double totalScore; // Sum of the test scores
    private int scoreCount; // Count of the test scores

    // Constructor
    public Tests() {
        totalScore = 0;
        scoreCount = 0;
    }

    // Method to get test scores from the user
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double score;

        System.out.println("Enter test scores (press -1 to quit):");

        // Enter a test score to prime the loop
        while (true) {
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score == -1) {
                    break; // Exit the loop if -1 is entered
                }
                totalScore += score; // Add score to total
                scoreCount++; // Increment count
            } else {
                System.out.println("Invalid input. Please enter a valid test score or -1 to quit.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the average
    public double calculateAverage() {
        if (scoreCount == 0) {
            return Double.NaN; // Return NaN if no scores were entered
        }
        return totalScore / scoreCount; // Calculate average
    }

    // Override toString method to display results
    @Override
    public String toString() {
        double average = calculateAverage();
        return String.format("The average of %d scores entered is %.2f.", scoreCount, average);
    }
}