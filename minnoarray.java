public class minnoarray{
    public static void main(String[] array){
        int[] arr={3,1,2,4,1,5};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}