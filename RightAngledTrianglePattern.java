public class RightAngledTrianglePattern {
    public static void printRightAnglePattern(int rows) {
        // printing pattern
        for(int row = 1; row <= rows; row++) {
            for(int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}