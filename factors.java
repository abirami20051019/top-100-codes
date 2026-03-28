import java.util.*;
public class factors{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        int n=15;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                {
                    if(n/i!=i){
                        list.add(n/i);
                    }
                }
            }
        }
        Collections.sort(list);
        System.out.print(list);
    }

}