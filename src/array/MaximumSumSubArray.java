package array;

public class MaximumSumSubArray {

    public static void main(String[] args){
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadene(array));
    }

    public static int kadene(int[] array){
        int localMaximum = array[0];
        int globalMaximum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            localMaximum = Integer.max(array[i], localMaximum + array[i]);
            if(localMaximum > globalMaximum){
                globalMaximum = localMaximum;
            }
        }
        return globalMaximum;
    }
}
