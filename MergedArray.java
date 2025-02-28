import java.util.Arrays;;

//Question1: Merge array and sort
public class MergedArray {


    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] mergeArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j] ) {
                mergeArray[k] = arr1[i];
                i++;
            } else {
                mergeArray[k] = arr2[j];
                j++;
            }
            k++;
        }


        while (i < arr1.length) {
            mergeArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergeArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergeArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7};
        int[] arr2 = {2, 5, 6};

        int[] mergedArray = mergeArray(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

    }
}