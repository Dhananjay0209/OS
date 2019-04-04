class RunThread implements Runnable{
   public void run(){
       System.out.println("Thread  immplemention by Runnable Interface");
   }
    public static void main(String args[]){
        RThread t = new RThread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
