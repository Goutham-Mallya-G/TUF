public class pattern18 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i =0 ; i<num ; i++){
            char value = 'A'-1;
            int diff = num-i;
            value = (char) (value+diff);
            for(int j = 0 ; j<=i ; j++){
                if(j==0){
                }
                else {
                    value = (char) (value + 1);
                }
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
