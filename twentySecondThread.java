public class twentySecondThread extends Thread{
    public void run(){
        for(int cont = 0; cont < 20; cont++){
                System.out.println(cont + 1);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        twentySecondThread thread = new twentySecondThread();
        thread.start();
    }
    
}
