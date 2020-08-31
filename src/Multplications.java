
public class Multplications {
    public static void main(String[] args) {
        int result;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.printf("%d x %d = %d", i, j, result);
                System.out.println("\n");
            }
        }
    }
}