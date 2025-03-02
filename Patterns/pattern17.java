public class pattern17 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i=0 ; i<num ; i++){
            //space
            for(int j = 1 ; j<=num-i ; j++){
                System.out.print(" ");
            }
            //letters
            char value = 'A'-1;
            for(int j = 0 ; j<(2*i) +1 ; j++){
                if(j <= i){
                    value = (char) (value+1);
                }else{
                    value = (char) (value-1);
                }
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
