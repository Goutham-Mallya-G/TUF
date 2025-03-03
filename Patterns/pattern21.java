public class pattern21 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i=0 ; i<num ; i++){
            for(int j=0 ; j<num ; j++){
                if(i==0 || i==num-1 || j==0 || j==num-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
