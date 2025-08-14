public class Neon {
    public static boolean checkNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] arg) {
        int n = 9;
        if (checkNeon(n)) {
            System.out.println("Given numbers " + n + " is Neon");
        } else {
            System.out.println("Given numbers " + n + " is not Neon");
        }
    }
}
