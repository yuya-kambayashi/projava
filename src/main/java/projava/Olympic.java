package projava;

import java.util.Arrays;

public class Olympic {
    public boolean isSummerOlympicYear(int year) throws IllegalArgumentException{
        if (2032 < year){
            throw new IllegalArgumentException("2023年までをサポートしています。入力:" + year);
        }
        if (year < 1896){
            return false;
        }

        int[] yearsNotHeld =  {1916, 1940, 1944 , 2020};
        if (Arrays.stream(yearsNotHeld).anyMatch( y -> y == year)){
            return false;
        }
        int[] yearsSpecialHeld =  {2021};
        if (Arrays.stream(yearsSpecialHeld).anyMatch( y -> y == year)){
            return true;
        }

        return year % 4 == 0;
    }
}
