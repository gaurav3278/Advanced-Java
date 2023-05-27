import java.util.*;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n,newNum = 0;
        while(temp>0){
            int digit = temp%10;
            newNum = newNum*10 + digit;
            temp/=10;
        }
        if(newNum == n)
        System.out.println("The number is palindrome.");
        else
        System.out.println("The number is not palindrome.");
    }
}