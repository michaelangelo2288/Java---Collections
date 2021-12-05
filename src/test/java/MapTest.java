import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class MapTest {
    Map<String, String> map = new HashMap<>();
    String[] first = {"foo1","foo2","foo3","foo4"};
    String[] last = {"bar1","bar2","bar3","bar4"};

    @Test
    public void mapRemovePutTest() {
        for(int i = 0; i<first.length; i++)
            map.put(first[i], last[i]);

        System.out.println("original map: " + map);
        map.remove("foo3");
        System.out.println("remove() key/value pair -> foo3 : bar3");
        map.put("foo4","something");
        System.out.println("put() key/value pair -> foo4 : something");
        System.out.println("new map -> " + map);
    }

    @Test
    public void mapIterateWithEntrySetTest() {
        for(int i = 0; i<first.length; i++)
            map.put(first[i], last[i]);

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(String.format("Iterate map via entrySet() -> %s = %s", entry.getKey(), entry.getValue()));
        }
    }

    @Test
    public void mapArrayToList() {
        Integer[] arr = {3, 13, 4, 11,9};
        AtomicReference<Integer> total = new AtomicReference<>(0);
        List<Integer> numList = Arrays.stream(arr)
                .map(n -> total.updateAndGet(v -> v + n))
                .collect(Collectors.toList());
        System.out.println(numList);
    }
}
