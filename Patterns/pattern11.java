public class pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        int value = 0;
        for(int i = 1 ; i<=num ; i++){
            if(i%2!=0){
                value = 1;
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print(value);
                value = 1-value;
            }
            System.out.println();
        }

    }
}
