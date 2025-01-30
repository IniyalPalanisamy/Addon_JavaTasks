package Programminground;

public class Npattern {
    public static void main(String[] args) {
        int n=4;
        int num=1;
        
        for(int i =1;i<=n;i++){
            for(int s=0;s<i;s++){
		        System.out.print(" ");
		    }
            for(int j=0;j<n;j++){
                System.out.print(num);
                num++;
               }
                   

            System.out.println();

        }
        
    }
}
