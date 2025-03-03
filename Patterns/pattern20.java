public class pattern20 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int num){
        for(int i =1 ; i<=num ; i++){
            //up star
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            //up space
            for(int j=0 ; j< (num*2) - (i*2) ; j++){
                System.out.print(" ");
            }
            //up star
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i<=num ; i++){
            //down star
            for(int j = 0 ; j<num-i ; j++){
                System.out.print("*");
            }
            //down space
            for(int j=0 ; j<i*2 ; j++){
                System.out.print(" ");
            }
            //down star
            for(int j = 0 ; j<num-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
