import java.util.Scanner;

public class ExaminationSystem {

    // Static login credentials
    static String username = "student";
    static String password = "1234";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        if (login()) {
            System.out.println("\nLogin Successful!");
            startExam();
        } else {
            System.out.println("\nLogin Failed. Exiting...");
        }
    }

    // Login method
    static boolean login() {
        System.out.println("====== LOGIN ======");
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        return user.equals(username) && pass.equals(password);
    }

    // Exam method
    static void startExam() {
        int score = 0;
        System.out.println("\n====== JAVA MCQ TEST ======\n");

        System.out.println("Q1. Which of the following is a valid data type in Java?");
        System.out.println("A. number\nB. int\nC. real\nD. doubleint");
        System.out.print("Answer: ");
        String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("B")) score++;

        System.out.println("\nQ2. Which loop is guaranteed to execute at least once?");
        System.out.println("A. for\nB. while\nC. do-while\nD. foreach");
        System.out.print("Answer: ");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("C")) score++;

        System.out.println("\nQ3. What keyword is used to create a subclass?");
        System.out.println("A. inherits\nB. extends\nC. super\nD. implements");
        System.out.print("Answer: ");
        String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("B")) score++;

        System.out.println("\nQ4. What is the size of int in Java?");
        System.out.println("A. 4 bytes\nB. 2 bytes\nC. 8 bytes\nD. 16 bytes");
        System.out.print("Answer: ");
        String ans4 = sc.nextLine();
        if (ans4.equalsIgnoreCase("A")) score++;

        System.out.println("\nQ5. Which method is the entry point of Java program?");
        System.out.println("A. start()\nB. init()\nC. main()\nD. run()");
        System.out.print("Answer: ");
        String ans5 = sc.nextLine();
        if (ans5.equalsIgnoreCase("C")) score++;

        showResult(score);
    }

    // Result method
    static void showResult(int score) {
        System.out.println("\n====== RESULT ======");
        System.out.println("Total Questions: 5");
        System.out.println("Correct Answers: " + score);
        System.out.println("Wrong Answers: " + (5 - score));
        System.out.println("Your Score: " + (score * 20) + "%");

        if (score >= 3) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.println("Thank you for taking the exam!");
    }
}
