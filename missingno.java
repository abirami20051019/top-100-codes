public class missingno{
    public static void main(String[] args){
        int n=5;
        int[] arr={0,1,4,2,3};
        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];

        }
        System.out.print(sum);
    }
}