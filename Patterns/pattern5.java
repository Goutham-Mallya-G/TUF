public class pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i = 1 ; i<=num ; i++){
            for(int j = num ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
