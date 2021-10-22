import java.util.*;

 public class TreeMapIteratorExample {
    public static void main(String args[]) {
        
    
    TreeMap<String, String> treemap = new TreeMap<String, String>();
    
    treemap.put("Key1", "Pear");
    treemap.put("Key2", "Apple");
    treemap.put("Key3", "Orange");
    treemap.put("Key4", "Papaya");
    treemap.put("Key5", "Banana");
    
    
    
    Set set = treemap.entrySet();
    
    Iterator it = set.iterator();
    
    System.out.println("TreeMap contains: ");
    while(it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      System.out.print("Key is: "+pair.getKey() + " and ");
      System.out.println("Value is: "+pair.getValue());
    }
  }
}
