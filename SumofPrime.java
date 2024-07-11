import java.util.ArrayList;
import java.util.Scanner;
public class SumofPrime{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the no.of input");
        // int n=sc.nextInt();
        for(int i=0;i<100;i++){
            list.add(i);
        }
        // System.out.println(list);
        for(int num:list){
            int counter=0;
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    counter++;
                }
            }
            if(counter==0){
                sum=sum+num;
            }
        }
        System.out.println("The sum is:"+sum);
    }
}