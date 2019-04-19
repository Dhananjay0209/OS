public class short {

   
    public static void main(String[] args) {
        int pid[]={1,2,3,4};
        int at[]={1,2,0,3};
        int bt[]={2,3,2,1};
        int tat[]=new int[4];
        int ct[]=new int[4];
        
        int temp=0;
       for(int i=0;i<=3;i++)
       {
           for(int j=0;j<=3-(i+1);j++)
           {
           if(at[j]>at[j+1])
           {
                temp = at[j];
	        at[j] = at[j+1];
	        at[j+1] = temp;
	        temp = bt[j];
		bt[j] = bt[j+1];
		bt[j+1] = temp;
		temp = pid[j];
		pid[j] = pid[j+1];
		pid[j+1] = temp;
           }
           }
               
       }
       
       for(int i=0;i<at.length-1;i++)
           if(at[i]==at[i+1]&& bt[i]>bt[i+1])
           {
               temp=bt[i];
               bt[i]=bt[i+1];
               bt[i]=bt[i+1];
               bt[i+1]=temp;
           
       
    }
       for(int i=0;i<at.length;i++)
       {
           if(i==0)
           { ct[i]=at[0]+bt[0];
           System.out.println(ct[i]);}
           else
           { ct[i]=ct[i-1]+bt[i];
           System.out.println(ct[i]);}
    }
}
}
