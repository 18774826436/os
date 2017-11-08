package Kernel;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import Data.PID;
import GUI.Main;
import GUI.reverse;



public class MainProcess {

	public static int flag = 0;
	public static int flag2 =0;
	public static PID gpcb = new PID();
	public static PID gpcb2 = new PID();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		               //进程标号
		List<PID> list = new ArrayList<PID>();    //存每个进程
		
		List<PID> list2 = new ArrayList<PID>(); 
		
		Timer timer = new Timer();

        TimerTask creat = new TimerTask (){
        public void run() {
        	 int randWeight = new Random().nextInt(10) + 1; 
        	 double randTime = Math.random()*5;
        	 String status = "reverse";
        	 String name = getRandomString(4);
        	 PID pcb = new PID(name,randTime,randWeight,status);
        	 list.add(pcb);
        }       
     };
     
     

     BlockingQueue queue = new LinkedBlockingQueue();    
     ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 1, TimeUnit.DAYS, queue);    
     ThreadPoolExecutor executor2 = new ThreadPoolExecutor(3, 6, 1, TimeUnit.DAYS, queue); 
     for (int i = 0; i < 2000; i++) {   
    	 
    	 executor2.execute(new Runnable() {    
    	      
             public void run() {    
                 try {    
                     Thread.sleep(1000);    
                 } catch (InterruptedException e) {    
                     e.printStackTrace();    
                 }  
                 
                 
                 reverse frame = new reverse(list);
                 frame.setLocation(100, 600);
                 frame.setUndecorated(true);
				 frame.setVisible(true);
				 
             }    
         });    
    	 
    	 
         executor.execute(new Runnable() {    
      
             public void run() {    
                 try {    
                     Thread.sleep(1000);    
                 } catch (InterruptedException e) {    
                     e.printStackTrace();    
                 }  	 
				 Main main = new Main(list,list2);
				 main.setLocation(800,250);
				 main.setUndecorated(true);
				 main.setVisible(true);
             }    
         });
     }        
    executor.shutdown();    
	timer.schedule (creat, 1000L, 1000L); //每秒闪烁一次光标
}
	
	
	
	
	public static String getRandomString(int length) { //length表示生成字符串的长度 
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	 }     
	
	public static void sortList(List<PID> list)
	{
		
		for(int i = 0; i < 6 ; i ++)
		{
			for(int j = 0 ; j < 6 ; j++)
			{
				if(list.get(j).getWeight() < list.get(j + 1).getWeight())
				{
					PID temp = list.get(j + 1);
					list.set(j + 1, list.get(i));
					list.set(j, temp);
				}
			}
		}
	}
	
}



