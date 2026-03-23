import java.util.Scanner;
public class positive{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a==0){
            System.out.print("zero");
        }
        else{
            String result=a>0?"positive":"negative";
            System.out.print(result);
        }
        
    }
}