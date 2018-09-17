package lesson04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ProgramFourthPartSecond {
    public static void main(String[] args) {
        ArrayList<Integer> colList = new ArrayList<>();
        colList.add(1);
        colList.add(2);
        colList.add(3);
        colList.add(4);

        colList.remove(new Integer(2));
        printEach(colList);

        colList.remove(2);
        printEachIterator(colList);

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        map.put("First".intern(), colList);

        System.out.println(map.get("First"));

        HashSet<String> set = new HashSet<>();
        set.add("adb");
        set.add("db");
        set.add("db");
        System.out.println("");
        System.out.println(set);
    }

    private static void printEachIterator(ArrayList<Integer> arr){
        System.out.println("");
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void printEach(ArrayList<Integer> arr){
        System.out.println("");
        for(Integer integer : arr){
            System.out.println(integer);
        }
    }
}
