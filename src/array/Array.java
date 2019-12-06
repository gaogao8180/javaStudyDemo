package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //声明数组
        int[] array;
        String[] array2;
        //分配内存空间
        array = new int[6];
        //给数组赋值
        array[2] = 6;
        //数组输出
        String str = Arrays.toString(array);
        System.out.println(str);


        //边创建边赋值
        int[] array3 = {1,2,3,4,5,6};

        //第三种创建方式，[]中不能写数值。
        int[] array4 = new int[] {1,2,3,4,5,6};

        //数组的常规操作及方法
        //1、求数组的最大值
        int[] arr1 = {73,80,62,93,96,87};
        int max = arr1[0];
        for(int i=1;i<arr1.length;i++){
            if (arr1[i]>max){
                max = arr1[i];
            }
        }
        System.out.println("数组中的最大值是"+max);

        //2、求数组的最小值
        int min = arr1[0];
        for(int i=1;i<arr1.length;i++){
            if (arr1[i]<min){
                min = arr1[i];
            }
        }
        System.out.println("数组中的最小值是"+min);

        //3、在数组的制定位置插入数据
        int num = 83;
            //将整数83插入到数组arr1的下标位置3处
        int[] arr2 = new int[arr1.length+1];
            //将原数组中的数据移动到新的数组中
        for(int i=0;i<3;i++){
            arr2[i] = arr1[i];
        }
        for(int i=4;i<arr2.length;i++){
            arr2[i] = arr1[i-1];
        }
        arr2[3] = num;
        System.out.println("插入前的数组是"+Arrays.toString(arr1));
        System.out.println("插入后的数组是"+Arrays.toString(arr2));

        //4、对数组进行排序
        int[] arr3 = {96,93,87,83,73,62};
        for(int j=0;j<arr3.length-1;j++){
            for(int i=0;i<arr3.length-1-j;i++){
                if(arr3[i]>arr3[i+1]){
                    int temp = arr3[i];
                    arr3[i] = arr3[i+1];
                    arr3[i+1] = temp;
                }
            }
        }
        System.out.println("排序后的数组是"+Arrays.toString(arr3));
    }

}
