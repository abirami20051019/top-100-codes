public class checksort{
    static boolean sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        int arr[]={1,2,5,6,6};
        System.out.print(sort(arr));
    }
}


    
