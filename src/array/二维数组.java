package array;

public class 二维数组 {
    public static void main(String[] args) {
        int[][] array = new int[3][6];
        int sum = 0;
        for(int i=0;i<array.length;i++){
            System.out.println("------第"+ (i+1) + "层货架------");
            for(int j=0;j<array[i].length;j++){
                int num = (i+1)*(j+1);
                sum += num;
                System.out.println("第"+(j+1)+"格挡鸡蛋的数量为："+num);
            }
        }
        System.out.println("鸡蛋的总数为:"+sum);
    }
}
