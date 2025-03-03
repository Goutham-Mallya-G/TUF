public class pattern19 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i = 0 ; i<num ; i++){
            //star
            for(int j = num ; j>i ; j--){
                System.out.print("*");
            }
            //space
            for(int j = 0 ; j<i*2 ; j++){
                System.out.print(" ");
            }
            //star
            for(int j = num ; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=num ; i++){
            //star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //space
            for(int j=1 ; j<=(num*2) - (i*2) ; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
