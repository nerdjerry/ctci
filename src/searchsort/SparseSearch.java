package searchsort;

public class SparseSearch {
    
    public static void main(String[] args){
        String[] array = {"at", "", "","","ball","","cat","","","","dad","",""};
        System.out.println(search(array, "cat"));
    }

    private static int search(String[] array, String string) {
        if(array == null || string == null || string == ""){
            return -1;
        }
        return binarySearch(array, string, 0, array.length-1);
    }

    private static int binarySearch(String[] array, String string, int low, int high) {
        if(low > high || (low == high && array[low] == "")) return -1;
        int mid;
        if(low <= high){
            mid = (low + high)/2;
            if(array[mid] != ""){
                if(array[mid].compareTo(string) > 0){
                    return binarySearch(array, string, low, mid - 1);
                }else if(array[mid].compareTo(string) < 0){
                    return binarySearch(array, string, mid+1, high);
                }else{
                    return mid;
                }
            } else{
                int left = binarySearch(array, string, low, mid - 1);
                int right = binarySearch(array, string, mid+1, high);
                return left != -1 ? low : right;
            }
        }
        return -1;
    }
}
