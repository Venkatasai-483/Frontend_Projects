package src.basic;

public class MissingChars {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean[] missingChars = missingCharacters(input,input.length());
        for (int i=0;i<missingChars.length;i++){
            if(!missingChars[i]) System.out.print((char)(97+i)+" ");
        }
    }

    public static boolean[] missingCharacters(String input, int len){
        boolean[] charArr = new boolean[26];
        for(char ch : input.toLowerCase().toCharArray()){
            if(ch>='a' && ch<='z'){
                charArr[ch-'a'] = true;
            }
        }
        return  charArr;
    }
}
