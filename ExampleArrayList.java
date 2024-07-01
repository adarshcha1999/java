import java.util.Scanner;
import java.net.SocketPermission;
import java.util.ArrayList;
public class ExampleArrayList{
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 10 Student names");
        for(int i=0;i<10;i++){
            String name=s.nextLine();
            student.add(name);
        }
        for(String name:student){
            System.out.println(name);
        }
        System.out.println("enter a name to search");
    }
}