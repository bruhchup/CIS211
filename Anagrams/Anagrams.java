import java.util.Arrays;

public class Anagrams{
    public static void main(){
        
        //list of words to input into isAnagram method
        String[] words = {"stop","pots","Hayden","Yukari","baby","adult","Jane","Naje","mood","doom"};
        
        //loops to execute the method using all the words in "words"
        for(int i = 0; i < words.length; i+=2){
            String word1 = words[i];
            String word2 = words[i + 1];
            if (isAnagram(words[i],words[i+1])){
                System.out.printf("%s and %s are anagrams!\n",word1,word2);   
            }else{
                System.out.printf("%s and %s are not anagrams!\n",word1,word2);
            }
        }             
    }

    private static boolean isAnagram(String str1, String str2){

        String lower1 = str1.toLowerCase();
        String lower2 = str2.toLowerCase();      
        
        //declares two arrays to hold histograms characters
        int[] counts = new int[26];
        int[] counts2 = new int[26];
        
        //copies "counts" array
        for(int i = 0; i < 3; i++){
            counts2[i] = counts[i];
        }
        
        //counts each character amount in string
        for (int i = 0; i < lower1.length(); i++){
            char letter = lower1.charAt(i);
            int index = letter - 'a';
            counts[index]++;
        }
        //counts each character amount in 2nd string
        for (int i = 0; i < lower2.length(); i++){
            char letter = lower2.charAt(i);
            int index = letter - 'a';
            counts2[index]++;
        }
        
        //converts each array of integers to strings; making them easier to compare
        String strValues1 = Arrays.toString(counts);
        String strValues2 = Arrays.toString(counts2);
        
        //compares the string of integers
        if(strValues1.equals(strValues2)){
            return true;
        }else{
            return false;
        }
    }
}