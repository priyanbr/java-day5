import java.util.*;
public class AddMethodExample {
    public static void main(String args[]) { 
 
       
       ArrayList<String> al = new ArrayList<String>(); 
 
       
         
       al.add("California");
       al.add("Boston");
       al.add("San jose");
       al.add("New York");
 
       
       
       al.add(2,"San Francisco");
       System.out.println("ArrayList after adding String San Francisco:"+ al);
        
       
       al.add(0, "Texas");

       
       System.out.println("ArrayList after adding String Texas:"+ al);
    }
}
