public class pattern1 {
    public static void main(String[] args) {
        pattern(6);
    }
    private static void pattern(int num){
        for(int i = 0; i<num ; i++){
            for(int j = 0 ; j<num ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
