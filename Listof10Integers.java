import java.util.ArrayList;
import java.util.Scanner;
public class Listof10Integers{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of input");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for(int i:list){
            sum+=i;
        }
        System.out.println("The sum is:"+sum);
    }
}