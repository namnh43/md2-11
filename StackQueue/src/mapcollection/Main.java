package mapcollection;

public class Main {
    public static void main(String[] args) {
        MyMapCollection myMap = new MyMapCollection();
        String str = "  W h  a   t    T H  E  F   U C      K i  s t h  a t!!";
        myMap.makeMapFromString(str);
        System.out.println(myMap);
    }
}
