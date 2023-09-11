package projava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraverseDeepTest {

    @Test
    void testCase1() {


        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1},
        };

        var actual = new TraverseDeep().traverse(map, 1, 1);

        char[] ch = {'.', '*', 'G', 'o'};
        for(var row : map){
            for(var cell : row){
                System.out.print(ch[cell]);
            }
            System.out.println();
        }

        var expected = true;

        Assertions.assertEquals(expected, actual);


    }





}