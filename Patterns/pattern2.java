public class pattern2 {
    public static void main(String[] args) {
        pattern(6);
    }
    private static void pattern(int num){
        for(int i = 0 ; i < num ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
