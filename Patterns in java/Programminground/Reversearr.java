package Programminground;

public class Reversearr {
    public static void main(String[] args) {
        int temp;
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
                
                    
                System.out.print(arr[i]+" ");       
        }
    }
    
}}
