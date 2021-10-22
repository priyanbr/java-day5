import java.util.*;

 public class HashMapSynchronizeExample {
    public static void main(String args[]) {
        
    
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(1, "Value1");
    hashmap.put(2, "Value2");
    hashmap.put(3, "Value3");
    hashmap.put(4, "Value4");
    hashmap.put(5, "Value5");
    Map map= Collections.synchronizedMap(hashmap);
    Set set = map.entrySet();
    synchronized(map){
        Iterator i = set.iterator();
        
        while(i.hasNext()) {
            Map.Entry pair = (Map.Entry)i.next();
            System.out.print(pair.getKey() + ": ");
            System.out.println(pair.getValue());
        }
    }
  }
}
