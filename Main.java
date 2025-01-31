import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    int marks;
    static int count=0;
    public Student()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Roll No:");
        rollno= scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the Name:");
        name=scan.nextLine();
        System.out.print("Enter the Mark:");
        marks=scan.nextInt();
        count++;
    }
    
    public void display()
    {
       
        System.out.println("Roll No:"+rollno+"\tName:"+name+"\tMarks:"+marks);
    }
}

class Main
{
    public void Rank(Student s[])
    {

    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        Student[] s=new Student[10];
        System.out.print("Enter the Number of students");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s[i]=new Student();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i].marks < s[j].marks)
                {
                     Student temp = s[i];
                     s[i]=s[j];
                     s[j]=temp;
                }
               
            }
        }
        System.out.println("\nRanklist\n");
        for(int i=0;i<n;i++)
        {
            s[i].display();
        }
    }
}