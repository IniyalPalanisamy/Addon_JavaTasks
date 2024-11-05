package problemsolving;

import java.util.Arrays;

public class StringVowelCons {
	public static void main(String[] args) {
		String word="Hello";
		String sen="hi hello world";
		S
		System.out.println(charIden(sen,'o'));
        System.out.println(vowelCheck(sen));
        System.out.println(Arrays.toString(vowlIden(sen)));
	}
	static int[] vowlIden(String str) {
		char[] vowels= {'a','e','i','o','u'};
		char[] cstr= str.toLowerCase().toCharArray();
		int vcount=0;
		int lcount=0;
		
		for(int i=0;i<vowels.length;i++) {
			for(int j=0;j<cstr.length;j++) {
				if(vowels[i]==cstr[j]) {
					vcount++;
					}
				if(i==0 && 'a'<=cstr[j] && cstr[j]<='z') {
					lcount++;
				}
			}
		}
		return new int[] {vcount,lcount-vcount};
	}
	
	
	static int vowelCheck(String str) {
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
            char vol = str.charAt(i); 
            if (vol == 'a' || vol == 'e' || vol == 'i' || vol == 'o' || vol == 'u') {
                count++;
            }
            
        }
        return count;
    
	}
	static int charIden(String str, char c) {
		int count=0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == 'o') {
	                count++;
	            }
	        }
	        return count;
	    
	}
}
