import java.util.HashMap;
public class Mapexample{
    public static void main(String[] args){
       HashMap<String,Integer> marks=new HashMap<>();
        marks.put("Adarsh",78);
        marks.put("Akhilesh",75);
        marks.put("Suraj",80);
        marks.put("Sachin",70);
        marks.put("Vivek",85);
        System.out.println(marks);
        for(String key : marks.keySet())
        {
            System.out.println(marks.get(key));
        }
    }
}