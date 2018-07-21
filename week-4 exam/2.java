import java.util.*;
class Solution{
    public static int[] countBits(int num) 
    {
        int[] result = new int[num+1];
        int p = 1; 
        int pow = 1;
        for(int i=1; i<=num; i++)
        {
            if(i==pow)
            {
                result[i] = 1;
                pow <<= 1;
                p = 1;
            }
            else
            {
                result[i] = result[p]+1;
                p++;
            }
     
        }
     
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a[]=countBits(i);
        int n=a.length;
        System.out.printf("[");
        for (int j=0;j<n ;j++ ) 
        {
            if (j<n-1) 
            {
                System.out.print(a[j]+",");     
            }
            else
            {
                System.out.print(a[j]);
            }
        }
        System.out.println("]");
    }
}