import java.util.*;

class Person{
    public String name,gender;
    public int age;

    public Person(String n,String g, int a){
        this.name = n;
        this.gender = g;
        this.age = a;
    }

}

class Account extends Person{
    public String accNo,accType;
    public double balance,withdraw,deposit,annualInterest;

    public Account(String n,String t,String name,String gender,int age,double b){
        super(name,gender,age);
        this.accNo = n;
        this.accType = t;
        this.balance = b;
    }

    public void CalcWithdrawl(){
        this.balance = this.balance - this.withdraw;
    }
    public void CalcDeposit(){
        this.balance = this.balance - this.deposit;
    }

    public double getBalance(){
        return this.balance;
    }
}

public class Bank extends Account {
    public Bank(String accNo,String accType,String name,String gender,int age,double balance){
        super(accNo, accType, name, gender, age,balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank ob = new Bank("7637463287","saving","Gaurav","Male",21,2345.23);
        System.out.println("Enter the amount you want to withdraw..");
        ob.withdraw = sc.nextDouble();
        ob.CalcWithdrawl();
        System.out.println("The balance after the transaction is "+ob.getBalance());
    }
}


