import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hse
{
    public static void main(String[] args)
    {
        HashMap <Integer,String> std=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        /*std.put(1,"Rahul");
        std.put(2,"Akash");
        std.put(3,"Riyan");*/

        /*System.out.println("Name:"+std.get(1));
        System.out.println("Name:"+std.get(2));
        System.out.println("Name:"+std.get(3));*/

        System.out.println("Enter the number of students");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the student ID:");
            int stdid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student name:");
            String name=sc.nextLine();

            std.put(stdid,name);
          
        }
          System.out.println("Uploading Successfull");
        while(true)
        {

            System.out.println("Enter the Student ID :");
            int id=sc.nextInt();
            if(id==0) break;
            if(std.containsKey(id))
            {
                System.out.println("Student name:"+std.get(id));
            }
            else
            {
                System.out.println("No such ID exist");
            }
        }
        /*for(Map.Entry<Integer,String> entry : std.entrySet())
        {
            String studentname=entry.getValue();
            System.out.println(studentname);
        }*/
    }
}

