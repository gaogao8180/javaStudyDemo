package array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {73,80,62,93,96,87};
        int[] array1 = {73,80,62,93,96,87};
        int[] array2 = {66,55,44,33,22};
        boolean flag = Arrays.equals(array,array1);
        System.out.println(flag);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //覆盖原数组，慎用
        Arrays.fill(array1,66);
        System.out.println(Arrays.toString(array1));

        int[] copyarray = Arrays.copyOf(array2,10);
        System.out.println(Arrays.toString(copyarray));
    }
}
