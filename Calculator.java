import java.util.*;

interface Arithematic{
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
    public void mod(int a,int b);
    public void add(float a,float b);
    public void sub(float a,float b);
    public void mul(float a,float b);
    public void div(float a,float b);
    public void mod(float a,float b);
}

public class Calculator implements Arithematic {
    public void add(int a,int b){
        int result = a+b;
        System.out.println(result);
    }
    public void sub(int a,int b){
        int result = a-b;
        System.out.println(result);
    }
    public void mul(int a,int b){
        int result = a*b;
        System.out.println(result);
    }
    public void div(int a,int b){
        int result = a/b;
        System.out.println(result);
    }
    public void mod(int a,int b){
        int result = a%b;
        System.out.println(result);
    }
    public void add(float a,float b){
        float result = a+b;
        System.out.println(result);
    }
    public void sub(float a,float b){
        float result = a-b;
        System.out.println(result);
    }
    public void mul(float a,float b){
        float result = a*b;
        System.out.println(result);
    }
    public void div(float a,float b){
        float result = a/b;
        System.out.println(result);
    }
    public void mod(float a,float b){
        float result = a%b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator ob = new Calculator();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("The available operation are +, -, *, / and %");
        System.out.print("Enter the operation you want to perform on the above two number: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
                ob.add(a,b);
                break;  
            case '-':
                ob.sub(a, b);
                break;
            case '*':
                ob.mul(a, b);
                break;
            case '/':
                ob.div(a, b);
                break;
            case '%':
                ob.mod(a, b);
                break;
            default:
                System.out.println("You chose an invalid operation...");
        }
        sc.close();
    }
}
