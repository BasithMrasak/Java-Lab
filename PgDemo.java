import java.util.*;
interface showable
{
    void show();
}

class Person implements showable
{
    String name,gender;
    int phno;
    public Person(Scanner sc)
    {
        sc.nextLine();
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the gender:");
        gender=sc.nextLine();
        System.out.println("Enter the phone number:");
        phno=sc.nextInt();
        
    }
    public void show()
    {
        System.out.println("Name:"+name+"\tGender:"+gender+"\tPhone Number:"+phno);
    }
}
class Student extends Person implements showable
{
     
    String course;
    int score;
    public Student(Scanner sc)
    {
        super(sc);
        sc.nextLine();
        System.out.println("Enter the course:");
        course=sc.nextLine();
        System.out.println("Enter the score:");
        score=sc.nextInt();
    }
    public void show()
    {
        super.show();
        System.out.println("Course:"+course+"\tScore:"+score);
    }
}
class PGStudents extends Student implements showable
{
    
    String researchArea,guide;
    public PGStudents(Scanner sc)
    {
       super(sc);
       sc.nextLine();
       System.out.println("Enter the Research Area:");
       researchArea=sc.nextLine();
       System.out.println("Enter the Guide:");
       guide=sc.nextLine();
    }
    public void show()
    {
        super.show();
        System.out.println("Research Area:"+researchArea+"\tGuide:"+guide);
    }
}
public class PgDemo
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        PGStudents[] p=new PGStudents[10];
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            p[i]=new PGStudents(sc);
        }
        for(int i=0;i<=n;i++)
        {
            p[i].show();
        }
    }
}