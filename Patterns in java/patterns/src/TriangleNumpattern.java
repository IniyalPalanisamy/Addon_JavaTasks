
public class TriangleNumpattern
{
	public static void main(String[] args) {
	   int	n=5;
	   
		for(int i=0;i<n;i++){
		    for(int s=0;s<i;s++){
		        System.out.print(" ");
		    }
		 
		    for(int j=5-i;j>0;j--)
		    {
		        System.out.print(j);
		      
		    }
		   
		   
		    System.out.println();
		}
	}
}