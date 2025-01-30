public class Pendulamarr {
    public static void main(String[] args) {
      int[] arr={6,8,13,15,7,5,11};
      int temp;
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length-1;j++){

           if(arr[i]>arr[j]){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }}
        System.out.println(arr[i]+ " ");

      }
      


    
}}

