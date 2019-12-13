/*
测试冒泡排序
 */

import array.Array;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = {3,7,0,1,5,4,8,9,2,6};

        int temp = 0;

        for (int i=0;i<values.length-1;i++){
            boolean flag = true;
            for(int j=0;j<values.length-1-i;j++){
                if(values[j]>values[j+1]){
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;

                    flag = false;
                }
                System.out.println(Arrays.toString(values));
            }

            if(flag){
                System.out.println("结束！");
                break;
            }
            System.out.println("################");
        }
    }
}
