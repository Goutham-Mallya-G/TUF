public class pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i=0 ; i<num ; i++){
            //space
            for(int j = 0; j < num - i; j++){
                System.out.print(" ");
            }
            //star
            for(int j =0 ; j< 2*i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0 ; i<num ; i++){
            //space
            for(int j=0 ; j<=i ; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1 ; j<=(2*num)-(i*2+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
