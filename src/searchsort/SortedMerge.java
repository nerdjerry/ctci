package searchsort;

public class SortedMerge{
    public static void main(String[] args){
        int[] A = {1,6,12,16,32,41,50,0,0,0,0};
        int[] B = {4,8,9,10};

        sortedMerge(A, B);
        for(int a : A){
            System.out.println(a);
        }
    }

    private static void sortedMerge(int[] a, int[] b) {
        int aIndex = a.length - b.length -1;
        int bIndex = b.length - 1;
        int insertIndex = a.length - 1;

        while(aIndex >=0 && bIndex >=0){
            if(a[aIndex] > b[bIndex]){
                a[insertIndex--] = a[aIndex--];
            }else{
                a[insertIndex--] = b[bIndex--];
            }
        }
        while (bIndex >= 0){
            a[insertIndex--] = b[bIndex--];
        }
    }
}