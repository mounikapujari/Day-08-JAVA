import java.util.*;
public class summidofNnum{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ns[]=new int[n];
        int k=0,sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            ns[k]=sum;
            k++;
        }
        System.out.println(ns[n/2]);
    } 
}