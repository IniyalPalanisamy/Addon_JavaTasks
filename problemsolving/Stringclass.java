package problemsolving;
import java.util.Arrays;
public class Stringclass {

	public static void main(String[] args) {
		//Literal way
		String name ="Iniyal";
		//Object way
		String name1= new String("Elamathi");
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(Arrays.toString(stringSplitter(name)));

		System.out.println(Arrays.toString(stringSplitter(name1)));

	}
	static char[] stringSplitter(String str) {
		char[] cstr=str.toCharArray();
		return cstr;
	}
	
	static char[] stringSplitter1(String str) {
		char[] carr= new char[6];
		for(int i=0;i<6;i++) {
			carr[i]= str.charAt(i);
		}
		
		return carr;
	}
	
	
	
	
	
	

}
