import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void listofListTest() {
        List<String> innerList1 = new ArrayList<>();
        List<String> innerList2 = new ArrayList<>();
        List<List<String>> outerList = new ArrayList<>();

        // outerList[0,1] = outerList[innerList1, innerList2]
        innerList1 = Arrays.asList("dog1", "dog2", "dog3", "dog4");
        outerList.add(innerList1);
        innerList2 = Arrays.asList("cat1", "cat2", "cat3", "cat4");
        outerList.add(innerList2);

        System.out.println(outerList.get(0).get(0));
        System.out.println(outerList.get(1).get(0));
        System.out.println(outerList.get(1).get(3));
        Assert.assertEquals("dog1", outerList.get(0).get(0));
        Assert.assertEquals("cat1", outerList.get(1).get(0));
        Assert.assertEquals("cat4", outerList.get(1).get(3));
    }
}
