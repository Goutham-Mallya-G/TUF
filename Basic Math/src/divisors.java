import java.util.ArrayList;

public class divisors {
    public static void main(String[] args) {
        System.out.println((prob(36)));
    }
    private static ArrayList<Integer> prob(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i<= num ;i++){
            if(num % i == 0){
                list.add(i);
            }
        }
        return list;
    }
}
