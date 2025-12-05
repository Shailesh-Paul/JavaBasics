package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

   public static  void HashMapMethods(){


        Map<String, Integer> np= new HashMap<>();

//        Adding Elements
        np.put("Akash ",21);
        np.put("Yash",16);
        np.put("Lav",17);
        np.put("Rishika", 19);
        np.put("Harry",18);

//        Getting value of a key from
        System.out.println(np.get("Yash")); // 16
        System.out.println(np.get("Rahul")); // will return null if it does not exist

        np.put("Akash",25);
        System.out.println(np.get("Akash"));
       System.out.println(np.remove("Akash"));
       System.out.println(np.containsKey("Akash"));
       System.out.println(np.containsKey("Lav"));


//       Adding a new entry only if the new key doesn't exist already
       np.putIfAbsent("Yashika",25);
       np.putIfAbsent("Yash" , 25);

//       Get all the keys in the hashMap
       System.out.println(np.keySet());

//        Get all values of HashMap
       System.out.println(np.values());

//       Get all the entries
       System.out.println(np.entrySet());


//       Traversing all entries of HAshMap - multiple methods

       for(String key:np.keySet()){
           System.out.printf("Age of %s is  %d\n", key , np.get(key));
       }
       System.out.println();
        for(Map.Entry<String , Integer> e: np.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());
        }
       System.out.println();
        for(var e:np.entrySet()){
            System.out.printf("Age of %s is %d \n",e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }


}
