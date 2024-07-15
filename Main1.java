class Person {
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
public class Main1
{
    public static void main(String[] args) {
        Person p1=new Person("Adarsh",20);
        System.out.println("Nmae of the person="+p1.getName());
        System.out.println("Age of the person="+p1.getAge());
    }
}
