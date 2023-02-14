package Array_Assignments;

import java.util.HashSet;
import java.util.Set;

//1832. Check if the Sentence Is Pangram
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
public class easy_10 {
    public static void main(String[] args) {
        String sentence = "leetcode"; //"thequickbrownfoxjumpsoverthelazydog";
        char[] arr =  sentence.toCharArray();
        Set set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }

        if(set.size() == 26){
            System.out.println("It is a pangram");
        }else{
            System.out.println("Not a pangram");
        }

    }
}
