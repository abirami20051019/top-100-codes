public class maxnoarray{
    public static void main(String[] args){
        int[] arr={3,2,5,4,2};
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.print(large);
    }
}