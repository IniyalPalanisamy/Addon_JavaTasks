import java.util.Arrays;
import java.util.Scanner;
public class stringclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				//Literal way
				String name ="Iniyal";
				//Object way
				String name1= new String("Elamathi");
				
				System.out.println(name);
				System.out.println(name1);
				
				System.out.println(Arrays.toString(stringSplitter(name)));

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

