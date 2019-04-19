public class SRTF {
    public static void main(String[] args) {

  	int[] P ={0,1,2,3};

  	int[] At ={2,1,3,5};

	int[] Bt ={3,2,4,6};

	int[] Ct ={0,0,0,0};

	int[] Tat ={0,0,0,0};

	int[] Wt = {0,0,0,0};

  	int[] Rem ={0,0,0,0};

	float AvgWt=0, AvgTat=0;
        int Count=0,CuT=0;

        System.arraycopy(Bt, 0, Rem, 0, At.length);
       
        while(true){
            if(Count==At.length){
                break;
            }
            int min=99,index = At.length;
            for(int i=0;i<At.length;i++){
                if(At[i]<= CuT && Rem[i] !=0 && Rem[i]<min){
                    min = Rem[i];
                    index = i;
                }
            }
            if(index == At.length){
                CuT++;
            }else{
                Rem[index]--;
                CuT++;
                if(Rem[index]==0){
                    Ct[index]=CuT;
                    Count++;
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
        System.out.println();
        System.out.println("PID.\tAT.\tBT.\tCT.\tTAT.\tWT.");

      for(int j=0;j<At.length;j++){

            System.out.println(P[j]+"\t"+At[j]+"\t"+Bt[j]+"\t"+Ct[j]+"\t"+Tat[j]+"\t"+Wt[j]);

            

       }

        System.out.println();

       System.out.println("Average TAT \t"+AvgTat);

       System.out.println("Average WT \t"+AvgWt);

}
}
