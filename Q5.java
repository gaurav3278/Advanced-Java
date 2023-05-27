import java.util.*;

public class Q5 {
    private int empid;
    private String name;
    private float salary,PF,HRA;

    public  Q5(String name,int empid, float PF, float HRA){
        this.name = name;
        this.empid = empid;
        this.PF = PF;
        this.HRA = HRA;
    }

    public String getName(){
        return this.name;
    }
    public int getEmpid(){
        return this.empid;
    }
    public float getPF(){
        return this.PF;
    }
    public float getHRA(){
        return this.HRA;
    }
    public float getSalary(){
        return this.salary;
    }
    public void calcSalary(){
        this.salary = this.PF + this.HRA;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Q5[] ob = new Q5[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter name of the "+i+1+" employee: ");
            String name = sc.nextLine();
            System.out.print("Enter employeeid of the "+i+1+" employee: ");
            int empid = sc.nextInt();
            System.out.print("Enter PF of the "+i+1+" employee: ");
            Float PF = sc.nextFloat();
            System.out.print("Enter HRA of the "+i+1+" employee: ");
            Float HRA = sc.nextFloat();
            ob[i] = new Q5(name,empid,PF,HRA);
            ob[i].calcSalary();
            System.out.println("The salary of employee "+i+1+" is "+ob[i].getSalary());
        }
        sc.close();

    }
}
