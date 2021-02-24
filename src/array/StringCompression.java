package array;

public class StringCompression {
    public static void main(String[] args){
        System.out.println(compress("aaabbccc"));
    }

    public static String compress(String input){
        StringBuilder compressedString = new StringBuilder();
        int i = 0, j = 0;
        while(i < input.length()){
            while(j < input.length() && input.charAt(i) == input.charAt(j)) j++;
            compressedString.append(input.charAt(i));
            compressedString.append((char) j - i);
            i = j;
        }
        return compressedString.length() > input.length() ? input : compressedString.toString();
    }
}
