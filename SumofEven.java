import java.util.ArrayList;
import java.util.Scanner;
public class SumofEven{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        int sum1=0;
        int sum2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of input");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for(int i:list){
            if(i%2==0){
                sum1+=i;  
            }
            else{
                sum2=sum2+i;
            }
        }
        System.out.println("The sum is:"+sum1);
        System.out.println("The sum is:"+sum2);
    }
}
