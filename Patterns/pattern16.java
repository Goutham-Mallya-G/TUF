public class pattern16 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        char value = 'A' - 1;
        for (int i = 0; i < num; i++) {
            value = (char) (value + 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

