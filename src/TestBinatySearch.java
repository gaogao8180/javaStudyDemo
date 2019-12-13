import java.util.Arrays;

public class TestBinatySearch {
    public static void main(String[] args) {
        int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(MyBinarySearch(arr,1000));
    }

    public static int MyBinarySearch(int[] arr,int values) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
                    int mid = (low + high) / 2;
                    if (arr[mid] == values){
                        return mid;
            }
            if(arr[mid] > values){
                high = mid - 1;
            }
            if(arr[mid] < values){
                low = mid +1;
            }
        }
        return -1;
    }
}



