package mapcollection;

import java.util.HashMap;
import java.util.Map;

public class MyMapCollection {
    private Map<Character,Integer> myMap;

    public MyMapCollection() {
        myMap = new HashMap<>();
    }
    public void makeMapFromString(String str) {
        //Convert string to array
        char [] chars = str.toLowerCase().replaceAll("\\s","").toCharArray();
        for (char c: chars) {
            if (myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c) + 1);
            } else {
                myMap.put(c,1);
            }
        }
    }

    @Override
    public String toString() {
        return "MyMapCollection{" +
                "myMap=" + myMap +
                '}';
    }
}
