public class primewithrange{
    static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int start=10;
        int end=20;
        for(int i=start;i<=end;i++){
          if(prime(i)){
            System.out.print(i+" ");
          }  
        }
    }
}