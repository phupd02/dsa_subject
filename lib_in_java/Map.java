package lib_in_java;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

public class Map {
    public static void main(String[] args, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("Phu", 2);// add key and value
        map.put("Lam", 3);
        map.put("Bo", 4);
        map.put("Me", 5);

        //print map
        System.out.println("PRINT MAP: " + map);//print map
        System.out.println("Key set: " +  map.keySet());// return a set key of the map

    }
}
