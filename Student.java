import java.util.*;

public class Student {
    private String name,gender;
    private int rollno,age,sub1,sub2;

    public void setData(String n,String g, int r, int a, int s1,int s2){
        this.name = n;
        this.gender = g;
        this.rollno = r;
        this.age = a;
        this.sub1 = s1;
        this.sub2 = s2;
    }

    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public int getRollno(){
        return this.rollno;
    }
    public int getAge(){
        return this.age;
    }
    public int getSub1(){
        return this.sub1;
    }
    public int getSub2(){
        return this.sub2;
    }

    public int CalcTotalMarks(){
        return this.sub1 + this.sub2;
    }

    public double CalcPercentage(){
        return CalcTotalMarks()/2.0;
    }

    public String getGrade(){
        if(CalcPercentage()>=90) return "A";
        else if(CalcPercentage()<90 && CalcPercentage()>80) return "B";
        else if(CalcPercentage()<80 && CalcPercentage()>70) return "C";
        else if(CalcPercentage()<70 && CalcPercentage()>60) return "D";
        else if(CalcPercentage()<60 && CalcPercentage()>50) return "E";
        else if(CalcPercentage()<50) return "F";
        return "";
    }

    public void displayData(int i){
        System.out.println("The name of " + i + " Student is: " + getName());
        System.out.println("The gender of " + i + " Student is: " + getGender());
        System.out.println("The rollno of " + i + " Student is: " + getRollno());
        System.out.println("The age of " + i + " Student is: " + getAge());
        System.out.println("The marks in sub1 out of 100 is of " + i + " Student is: " + getSub1());
        System.out.println("The marks in sub2 out of 100 is of " + i + " Student is: " + getSub2());
        System.out.println("The total marks of " + i + " Student is: " + CalcTotalMarks());
        System.out.println("The percentage of " + i + " Student is: " + CalcPercentage());
        System.out.println("The grade of " + i + " Student is: " + getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] ob = new Student[n];
        for(int i = 1;i<=n;i++){
            ob[i-1] = new Student();
            sc.nextLine();
            System.out.print("Enter Name of "+ i + " Student: ");
            String name = sc.nextLine();
            System.out.print("Enter Gender of "+ i + " Student: ");
            String gender = sc.nextLine();
            System.out.print("Enter Age of "+ i + " Student: ");
            int age = sc.nextInt();
            System.out.print("Enter RollNo of "+ i + " Student: ");
            int rollno = sc.nextInt();
            System.out.print("Enter marks of Sub1 of "+ i + " Student out of 100: ");
            int sub1 = sc.nextInt();
            System.out.print("Enter marks of Sub2 of "+ i + " Student out of 100: ");
            int sub2 = sc.nextInt();
            ob[i-1].setData(name, gender, rollno, age, sub1, sub2);
        }
        for(int i = 1;i<=n;i++){
            ob[i-1].displayData(i);
        }
        sc.close();

    }

}
