import java.util.HashSet;
public class Main{
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("java");
        names.add("python");
        names.add("C");
        names.add("java");
        System.out.println(names);
    }
}