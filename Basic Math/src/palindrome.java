public class palindrome {
    public static void main(String[] args) {
        System.out.print(probo(4594));
    }
    private static String probo(int num){
        String value = String.valueOf(num);
        int n = value.length();
        for(int i = 0 ; i<n/2 ; i++){
            if(value.charAt(i) == value.charAt(n-i-1)){
                continue;
            }
            else{
                return ("Not palindrome");
            }
        }
        return ("Palindrome");
    }
}
