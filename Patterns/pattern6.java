public class pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i = num ; i>=1 ; i--){
            for(int j =1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
