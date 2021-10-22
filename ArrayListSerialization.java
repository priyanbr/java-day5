import java.util.*;
import java.io.*;
 public class ArrayListSerialization {
    public static void main(String args[]) {
    
       ArrayList<String> al=new ArrayList<String>();
       al.add("Boston");
       al.add("Dallas");
       al.add("New York");

       try{
         FileOutputStream fos= new FileOutputStream("inputfile");
         ObjectOutputStream oos= new ObjectOutputStream(fos);
         oos.writeObject(al);
         oos.close();
         fos.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
        }
  }
}
