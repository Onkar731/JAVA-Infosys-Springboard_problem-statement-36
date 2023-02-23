import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int rows = sc.nextInt();

        // printing right angle pattern through printRightAnglePattern() method of RightAngledTrianglePattern class
        RightAngledTrianglePattern.printRightAnglePattern(rows);

        // closing resource
        sc.close();
    }
}