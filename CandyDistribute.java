public class CandyDistribute {
    public static void main(String[] args) {
        int[] ratings = new int[]{1, 0, 2};
        System.out.println("Minimum candy required: " + minCandy(ratings));
    }

    public static int minCandy(int[] ratings) {
        int[] candy = new int[ratings.length];

        for(int i = 0; i < ratings.length; i++) {
            candy[i] = 1;
        }

        for(int left = 1; left < ratings.length; left++) {

            //Compare current child's rating with left child's rating
            if(ratings[left] > ratings[left - 1]) {
                candy[left] = candy[left - 1] + 1;
            }
        }

        for (int right = ratings.length - 2; right >= 0; right--) {
            
            //Compare current child's rating with right child's rating
            if(ratings[right] > ratings[right + 1] && candy[right] <= candy[right + 1]) {
                candy[right] = candy[right + 1] + 1;
            }
        }

        //Find total candy
        int sum = 0;
        for(int item : candy) {
            sum += item;
        }
        return sum;
    }
}
