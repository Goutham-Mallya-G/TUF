public class pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int num) {
        int value = 0;
        for (int j = 0; j < num; j++) {
            for (int i = 0; i <= j; i++) {
                value++;
                System.out.print(value);
            }
            System.out.println();
        }
    }
}