import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayTest {

    // Two-dimensional arrays test
    @Test
    public void map1DArraysTo2DArrayTest() {
        String[] products = {"prod1", "prod2", "prod3", "prod4"};
        String[] properties = {"prop1", "prop2", "prop3", "prop4"};
        String[][] productsProperties = new String[16][2];                  // *** String[row][column]

        /*  ==== Loops below is putting products + properites arrays into 2-D array: productsProperties
               _____________                _____________
               |   prod1   |                |   prod2   |
               +-----------+                +-----------+          ... repeat for prod3, prod4
              /   |    |    \              /   |    |    \
          prop1 prop2 prop3 prop4      prop1 prop2 prop3 prop4

        productsProperties[][] = {{(0,0),(0,1)}, {(1,0),(1,1)}, {(2,0),(2,1)} ... {(15,0),(15,1)}};
        productsProperties[][] = {{prod1,prop1}, {prod1,prop2}, {prod1,prop3} ... {(15,0),(15,1)}};

         ============================================================================================ */

        int count = 0;
        int p = 0;
        for(int i=0; i<productsProperties.length; i++) {
            if(count < 3) {
                productsProperties[i][0] = products[p];
                productsProperties[i][1] = properties[count];

                // CHECKS:
                System.out.println(String.format("[%s][%s] = %s", i, 0, productsProperties[i][0]));
                System.out.println(String.format("[%s][%s] = %s", i, 1, productsProperties[i][1]));
                count++;
            } else {
                productsProperties[i][0] = products[p];
                productsProperties[i][1] = properties[count];
                p++;

                // CHECKS:
                System.out.println(String.format("[%s][%s] = %s", i, 0, productsProperties[i][0]));
                System.out.println(String.format("[%s][%s] = %s", i, 1, productsProperties[i][1]));
                count = 0;
            }
        }

        for(int i = 0; i < productsProperties.length; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.println(String.format("prodProp[%s][%s] = %s", i, j, productsProperties[i][j]));
            }
        }
    }


    @Test
    public void twoDimensionalArrayQuickTest() {

        //          |   0   |   1
        //      ----+-------+-------
        //      0   |   A   |   B
        //      1   |   C   |   D
        //      2   |   E   |   F

        String[][] letters = {{"A","B"}, {"C","D"}, {"E","F"}};     // {{(0,0), (0,1)}, {(1,0), (1,1)}, {(2,0), (2,1)}}
        System.out.println("pp size: " + letters.length);
        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.println(String.format("[%s][%s] = %s", i, j, letters[i][j]));
            }
        }
    }

}
