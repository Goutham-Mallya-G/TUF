public class count_digit {
    public static void main(String[] args) {
        System.out.print(prob(12345133));
    }
    private static int prob(int num){
        int count = 0;
        while (num>0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
