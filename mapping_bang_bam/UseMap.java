package mapping_bang_bam;
import java.util.HashMap;
import java.util.Map;
public class UseMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        //PUT   
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        // print tree
        System.out.println(map.entrySet());

        // remove
        map.remove(1);

        //print tree after removing
        System.out.println(map.entrySet());

        //contain
        System.out.println("Check 2 exist in tree??" + map.containsKey(2));

        //replace
        System.out.println("REPLACE");
        map.replace(2, "C", "B");
        System.out.println(map.entrySet());
        
    }
}
