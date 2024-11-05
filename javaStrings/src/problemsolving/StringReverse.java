package problemsolving;
import java.util.Arrays;
public class StringReverse {

	public static void main(String[] args) {
		String word="Hello";
		String sen="hi hello world";
		System.out.println(revStr(word));
		
		System.out.println(revStr(sen));
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
	
	static String sentenceRev(String str) {
		String rev="";
		String[] sarr=str.split(" ");
		for(String x: sarr) {
			rev= rev + " " +revStr(x);
		}
		return rev.trim();
	}
	
	static String revStr(String str){
		String rev="";
		for(int i=0;i<str.length();i++) 
			rev=str.substring(i,i+1) +rev;
			
		return rev;
	}
	

}
