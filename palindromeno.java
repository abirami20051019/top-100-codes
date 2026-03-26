public class palindromeno{
    public static void main(String[] args){
        int n=1221;
        String a=String.valueOf(n);
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                System.out.print("not palindrome");
            }
            i++;
            j--;
        }
        System.out.print("palindrome");
    }
}