public class Reverse {
    public static void main(String[] args) {
        System.out.print(prob(12345133));
    }
    private static int prob(int num){
        int ans = 0;
        while(num>0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        return ans;
    }
}