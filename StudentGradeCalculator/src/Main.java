import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of subjects");
                int numSubjects = sc.nextInt();
                int totalMarks = 0;
                double averagePercentage;

                System.out.println("Enter the marks for " + numSubjects + " subjects:");
                
                for (int i = 1; i <= numSubjects; i++) {
                    System.out.print("Enter marks for Subject " + i + ": ");
                    int marks = sc.nextInt();
                    totalMarks += marks;
                }

                averagePercentage = (totalMarks / (double) (numSubjects * 100)) * 100;


                String grade;
                if (averagePercentage >= 91) {
                    grade = "A+";
                } else if (averagePercentage >= 81) {
                    grade = "A";
                } else if (averagePercentage >= 71) {
                    grade = "B";
                } else if (averagePercentage >= 61) {
                    grade = "C";
                } else if (averagePercentage >= 51) {
                    grade = "D";
                } else if (averagePercentage >= 41) {
                    grade = "E";
                } else {
                    grade = "F";
                }


        System.out.println("\n-----Result-----");
                System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
                System.out.println("Average Percentage: " + averagePercentage + "%");
                System.out.println("Grade: " + grade);


                sc.close();
            }
        }


