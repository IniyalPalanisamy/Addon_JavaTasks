public class Minmaxsort{
    //alternative minmax
    public static void main(String[] args) {
        int temp;
        int[] arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i%2==0){
                    if(arr[j]<arr[i]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
                else
                    {
                        if(arr[j]>arr[i])
                        {
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    
                    }
               
                

            }

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
}}