public class pattern12 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i=1 ; i<=num ; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print(j);
            }
            for(int j = num-i ; j>0 ; j--){
                System.out.print("  ");
            }
            for(int j = num - (num-i) ; j >=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
