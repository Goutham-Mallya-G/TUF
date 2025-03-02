public class pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int num) {
        for (int i = 0; i < num; i++) {
            char value = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(value);
                value = (char) (value + 1);
            }
            System.out.println();
        }
    }
}