import java.util.*;
public class Fcfs {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter number of process");
        //int n=sc.nextInt();
        int[] pid={1,2,3,4};
        int[] ar={0,0,0,0};
        int[] bt={2,3,4,2};
        int ct[]=new int[10];
        int tat[]=new int[10];
        int wt[]=new int[10];
        
        for( int i=0;i<4;i++)
        {
            if(i==0)
            {
           if(ar[i]==0)
               ct[i]=bt[i];
           else
               ct[i]=bt[i]+ar[i];
        }
        else
            ct[i]=bt[i]+ct[i-1];
        System.out.println(ct[i]);
        
        }
        //for(int i=0;i<4;i++)
            
    }
    
}
