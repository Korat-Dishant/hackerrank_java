import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
 
    String str1 = input.nextLine();
    String str2 = input.nextLine();

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if(str1.length() == str2.length()) {

      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println("Anagrams");
      }
      else {
        System.out.println("Not Anagrams");
      }
    }
    else {
        System.out.println("Not Anagrams");
    }

    input.close();
  




    }
}