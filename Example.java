import java.util.ArrayList;
public class Example {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");
        System.out.println("Using Lambda Expression");
        names.forEach(x->System.out.println(x));
        System.out.println("Using Method Reference");
        names.forEach(System.out::println);
        System.out.println("Using For Loop");
        for(String x:names)
        {
            System.out.println(x);
        }
    }
    
}
