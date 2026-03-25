public class sumofnaturalno{
    static int getsum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+getsum(n-1);
        }
    }
    
        
    
    public static void main(String[] args){
        int n=5;
        int sum=getsum(n);
        System.out.print(sum);
    }
}