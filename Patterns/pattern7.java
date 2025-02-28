public class pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i = 0 ; i<num ; i++){
            //space
            for(int j=num -i ; j>=0 ; j--){
                System.out.print(" ");
            }
            //star
            for(int j = 0 ; j<2*i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
