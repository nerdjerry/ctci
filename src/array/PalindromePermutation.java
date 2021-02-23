package array;

public class PalindromePermutation {

    public static void main(String[] args){
        System.out.println(isPalindromePermutation("tact coa"));
    }

    public static boolean isPalindromePermutation(String input){
        int[] count = new int[128];
        int numOfSpace = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                count[input.charAt(i)]++;
            }else{
                numOfSpace++;
            }
        }
        int counter = 1;
        for(int num : count){
            if(num %2 != 0){
                counter--;
            }
            if(counter < 0){
                return false;
            }
        }
        return  true;
    }
}