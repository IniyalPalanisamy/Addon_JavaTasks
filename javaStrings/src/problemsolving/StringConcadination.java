package problemsolving;

public class StringConcadination {
	public static void main(String[] args) {
		char[] carr = {'i','n','i','y','a','l'};
		String[] sarr= {"E","l","a","m","a","t","h","i"};
       System.out.println(carrToString(carr));
       System.out.println(carrToString2(carr));
       System.out.println(carrToString3(carr));
       System.out.println(carrToString4(sarr));
       System.out.println(carrToString5(carr));
	}
	
	static String carrToString(char[] carr) {        
     String cstr ="";
     for(int i=0;i<carr.length;i++)
         cstr +=carr[i] ; //cstr=cstr+carr[0];
     return cstr;
}    
	static String carrToString2(char[] carr) {
		String cstr=new String(carr);
		return cstr;
	}
	
	static StringBuilder carrToString3(char[] carr) {
		StringBuilder cstr= new StringBuilder();
		cstr.append(carr);
		return cstr;
	}
	
	static String carrToString4(CharSequence[] sarr) {
		String cstr=String.join("",sarr);
		return cstr;
	}
	 
	static String carrToString5(char[] carr) {
		String cstr= String.copyValueOf(carr);
		return cstr;
	}
	
}
         