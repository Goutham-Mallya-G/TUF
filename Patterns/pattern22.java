public class pattern22 {
    public static void main(String[] args) {
        pattern(4);
    }
    private static void pattern(int num){
        for(int i = 0 ; i<(num*2)-1 ; i++){
            for(int j =0 ; j<(num*2)-1 ; j++){
                int top = i;
                int left = j;
                int right = (2*num - 1) - 1 - i;
                int bottom = (2*num - 1) - 1 - j;
                System.out.print(num-Math.min(Math.min(top,bottom),Math.min(left,right)));
                }
            System.out.println();
        }
    }
}
