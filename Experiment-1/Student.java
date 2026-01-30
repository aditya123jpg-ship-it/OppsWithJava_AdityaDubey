public class Student
{
    String name;
    int uid;
    int age;
    
    public Student()
    {
        name="Not filled";
        age=0;
        uid=0;
    }
    
    public Student(String n, int u, int a)
    {
        name=n;
        uid=u;
        age=a;
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Uid: "+uid);
    }
    
    public static void main(String[] args)
    {
        Student s = new Student();
        s.display();
        
        Student s1 = new Student("Aditya",1,20);
        s1.display();
    }
};