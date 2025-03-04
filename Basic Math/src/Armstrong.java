public class Armstrong {
    public static void main(String[] args) {
        System.out.print(prob(1853));
    }
    private static boolean prob(int num){
        int cp = num;
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += Math.pow(digit , 3);
            num /= 10;
        }
        return (sum == cp ? true : false);
    }
}
