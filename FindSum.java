import java.util.Arrays;
//Find elements with total equal k in array
public class FindSum {
    

    //Find 2 elements with total equal k in array
    public static int[] findSumOfTwo(int[] arr, int sum) {
        int leftPointer = 0, rightPointer = arr.length - 1;

        while (leftPointer < rightPointer) {
            int current = arr[leftPointer] + arr[rightPointer];
            if(current == sum) {
                return new int[]{arr[leftPointer], arr[rightPointer]};            
            } else if (current < sum) {
                leftPointer++;
            } else if (current > sum) {
                rightPointer--;
            }
        }
        return null;

    }

    //Find 3 elements with total equal k in array
    public static int[] findSumOfThree(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {

            int leftPointer = i + 1, rightPointer = arr.length - 1;

            while (leftPointer < rightPointer) {
                int current = arr[leftPointer] + arr[rightPointer];
                if(current == sum - arr[i]) {
                    return new int[]{arr[i], arr[leftPointer], arr[rightPointer]};
                } else if (current < sum) {
                    leftPointer++;
                } else if (current > sum) {
                    rightPointer--;
                }
            }


        }

        return null;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int k = 6;
        System.out.println(Arrays.toString(findSumOfTwo(arr, k)));
        System.out.println(Arrays.toString(findSumOfThree(arr, 9)));
    }
}
