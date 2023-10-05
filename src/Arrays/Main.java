package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SingleDimensionArray sda = new SingleDimensionArray(5);
//        sda.insert(0, 1);
//        sda.insert(1, 2);
//        sda.insert(2, 3);
//        sda.insert(3, 4);
//        sda.insert(4, 5);
//
////        System.out.println(Arrays.toString(sda.arr));
//        sda.traverseArray();
//
//        sda.searchArray(1);
//
//        sda.deleteArray(1);
//        sda.traverseArray();

        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);
        tda.insertValueInTheArray(0,0, 1);
        tda.insertValueInTheArray(0,1,2);
        tda.insertValueInTheArray(0,2,3);
        tda.insertValueInTheArray(1,0,4);
        tda.insertValueInTheArray(1,1,5);
        tda.insertValueInTheArray(1,2,6);
        tda.insertValueInTheArray(2,0,7);
        tda.insertValueInTheArray(2,1,8);
        tda.insertValueInTheArray(2,2,9);

        tda.selectCell(2,2);

        tda.traverseArray();

        tda.searchArray(8);

        tda.deleteValue(1,1);
        tda.traverseArray();
    }
}