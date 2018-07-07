import java.util.*;
 
class Solution{

    static boolean areAnagram(char[] str1, char[] str2)
    {
        
        int n1 = str1.length;
        int n2 = str2.length;
    
        if (n1 != n2)
            return false;

        // for (int i=0;i<n1 ;i++ ) {
            
        // }
        quickSort(str1, 0, n1 - 1);
        quickSort(str2, 0, n2 - 1);
  
        for (int i = 0; i < n1;  i++)
            if (str1[i] != str2[i])
                return false;
  
        return true;
    }
  
    static void exchange(char A[],int a, int b)
    {
        char temp;
        temp = A[a];
        A[a]   = A[b];
        A[b]   = temp;
    }
  
    static int partition(char A[], int a, int b)
    {
        char x = A[b];
        int i = (a - 1);
        int j;
      
        for (j = a; j <= b - 1; j++)
        {
            if(A[j] <= x)
            {
                i++;
                exchange(A, i, j);
            }
        }
        exchange (A, i+1 , b);
        return (i + 1);
    }
  
    static void quickSort(char A[], int a, int b)
    {
        int pi;   
        if(a < b)
        {
            pi = partition(A, a, b);
            quickSort(A, a, pi - 1);
            quickSort(A, pi + 1, b);
        }
    }
  
    public static void main(String args[])
    {
        String s="keep";
        String t="Peek";
        s=s.toLowerCase();
        t=t.toLowerCase();
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();
       
        if (areAnagram(str1, str2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}