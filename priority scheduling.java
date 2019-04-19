public class Os {
    public static void main(String[] args) {
        int[] P = {1,2,3,4};
        int[] At = {1,0,2,3};
        int[] Bt = {2,4,3,2};
        int[] Pt = {1,2,1,3};
        int[] Ct = new int[4];
        int[] Tat = new int[4];
        int[] Wt = new int[4];
        float AvgWt=0, AvgTat=0;
        for(int k=1;k<At.length;k++){
        for(int i=1;i<At.length;i++){
        if(At[i-1]>At[i]){
            int temp = At[i-1];
            At[i-1] = At[i];
            At[i] = temp;
            temp = P[i-1];
            P[i-1] = P[i];
            P[i] = temp;
            temp = Bt[i-1];
            Bt[i-1] = Bt[i];
            Bt[i] = temp;
            temp = Pt[i-1];
            Pt[i-1] = Pt[i];
            Pt[i] = temp;
       }
        }
       }
        for(int k=1;k<At.length;k++){
      for(int i=0;i<At.length-1;i++){
            if(At[i]==At[i+1]&&Pt[i]>Pt[i+1]){
               int temp = Bt[i];
               Bt[i] = Bt[i+1];
               Bt[i+1]= temp;
               temp = At[i+1];
               At[i+1] = At[i];
                At[i] = temp;
                temp = P[i+1];
                P[i+1] = P[i];
                P[i] = temp;
                temp = Pt[i-1];
                Pt[i-1] = Pt[i];
                Pt[i] = temp;
            
           }}
           }
 
          for(int i=0;i<At.length;i++){
              
                if(i == 0){
			Ct[i] =At[i]+ Bt[i];
		}
                else if(Ct[i-1]<At[i]){
                       Ct[i]=(Bt[i]+ Ct[i-1])+(At[i]-Ct[i-1]);
                }
                else{
                    	Ct[i]= Bt[i]+ Ct[i-1];
		}
	}
          for(int k=1;k<At.length;k++){
      for(int i=1;i<At.length;i++){
        if(P[i]<P[i-1]){
            int temp = At[i-1];
            At[i-1] = At[i];
            At[i] = temp;
            temp = P[i-1];
            P[i-1] = P[i];
            P[i] = temp;
            temp = Bt[i-1];
            Bt[i-1] = Bt[i];
            Bt[i] = temp;
            temp = Ct[i-1];
            Ct[i-1] = Ct[i];
            Ct[i] = temp;
             temp = Pt[i-1];
                Pt[i-1] = Pt[i];
                Pt[i] = temp;
        }
      }
          }
         for(int j=0;j<P.length;j++){
            Tat[j] = Ct[j] - At[j];
            Wt[j] = Tat[j] - Bt[j];
            AvgTat = AvgTat + Tat[j];
            AvgWt = AvgWt + Wt[j];
       }
        AvgTat = AvgTat/(P.length );
        AvgWt = AvgWt/(P.length );     
        System.out.println("P\tA\tB\tC\tT\tW\tPt");
      for(int j=0;j<At.length;j++){
            System.out.println(P[j]+"\t"+At[j]+"\t"+Bt[j]+"\t"+Ct[j]+"\t"+Tat[j]+"\t"+Wt[j]+"\t"+Pt[j]);
            
       }
        System.out.println();
       System.out.println("Average TAT \t"+AvgTat);
       System.out.println("Average WT \t"+AvgWt);
    }
    
}
