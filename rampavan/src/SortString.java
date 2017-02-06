import java.util.Arrays;
import java.util.Scanner;

public class SortString {


	

	/*public boolean checkAnagram(String str1, String str2) {

	    if (str1.length() != str2.length()){
	      return false;
	    }
	    char[] a = str1.toCharArray();
	    char[] b = str2.toCharArray();

	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    return Arrays.equals(a, b);
	    	
	}
	
	public static boolean isPermutation(String s1, String s2){
	    if (s1.length() != s2.length()) return false;
	    int checker = 0;
	    for(int i = 0; i < s1.length();i++ ){
	        checker ^= s1.charAt(i) ^ s2.charAt(i);
	    }

	    return checker == 0;
	}
	
	
	public static void main(String[] args) {
		
		SortString ca=new SortString();
		
		ca.checkAnagram("Michael", "Bor");
		System.out.println(ca);
		
	}
	
}

	*/
	 public static void main(String[] args) {
	   String str = "aabcccccaaa";
       StringBuilder sb = new StringBuilder();

       char[] arr = str.toCharArray();
       char previous = ' ';
       int count = 0;
       int i = 0;
       for (char c : arr) {
           i += 1;
           if (c == previous) {
               count += 1;
           } else {
               if (count > 1) {
                   sb.append(count);
                   sb.append(c);
                   count = 1;
               } else {
                   count = 1;
                   if (previous != ' ' && previous != c) {
                       sb.append(1);
                   }
                   sb.append(c);
               }
           }
           if (arr.length == i) {
               sb.append(count);
           }
           previous = c;
       }
       System.out.println(sb.toString());
   }

}	


