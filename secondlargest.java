public class secondlargest{
    public static void main(String[] args){
        int arr[]={1,2,4,7,7,5};
        int fl=arr[0];
        int sl=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fl){
                sl=fl;
                fl=arr[i];
                
            }
            else if(arr[i]>sl && arr[i]!=fl){
                sl=arr[i];
            }

        }
        System.out.print(sl);
    }
}