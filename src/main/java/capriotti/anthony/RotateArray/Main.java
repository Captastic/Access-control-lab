package capriotti.anthony.RotateArray;

/**
 * Created by anthonycapriotti on 1/19/17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main extends ArrayList {
    public static void main(String[] args) {
        List arrayList = new ArrayList();


        for (int i = 0; i < 6; i++) {
            arrayList.add(i);
        }
        System.out.println("Starting : "+ arrayList);

        Collections.rotate(arrayList, 3);

        System.out.println("Rotated : "+ arrayList);
    }
}








