import java.util.*;
public class prime {
    public static Boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
        System.out.println("The number is prime.");
        else
        System.out.println("The number is not prime.");
    }
}
