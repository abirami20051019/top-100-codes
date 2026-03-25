public class greaterof3{
    public static void main(String[] args){
        int a=20;
        int b=20;
        int c=10;
        if(a>=b && a>=c){
            System.out.print("a is big");
        }
        else if(b>=a && b>=c){
            System.out.print("b is big");
        }
        else{
            System.out.print("c is big");
        }
    }
}