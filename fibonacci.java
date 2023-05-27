import java.util.*;

public class fibonacci {
    public static int helper(int i){
        if(i == 0) return 0;
        if(i == 1 || i == 2){
            return 1;
        }
        return helper(i-1)+helper(i-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 0;i<n;i++){
            System.out.print(helper(i)+" ");
        }
    }
}
