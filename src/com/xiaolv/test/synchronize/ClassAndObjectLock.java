package com.xiaolv.test.synchronize;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class lock
 * object lock
 * @author Charlie
 *
 */
public class ClassAndObjectLock   
{  
	
	Logger logger = LoggerFactory.getLogger(ClassAndObjectLock.class);
//	static int i =5;
    public void lockBlkMethod()   
    {    
         synchronized(this)   //object lock
         {    
              int i = 5;    
              while( i-- > 0)   
              {    
                   logger.info(Thread.currentThread().getName() + " : " + i);    
                   try   
                   {    
                        Thread.sleep(500);    
                   }   
                   catch (InterruptedException ie)   
                   {    
                   }    
              }    
         }    
    }    
      
    public /*synchronized*/ void lockMethod()    //method lock
    {    
         int i = 5;    
         while( i-- > 0)   
         {    
        	 logger.info(Thread.currentThread().getName() + " : " + i);    
              try   
              {    
                   Thread.sleep(500);    
              }   
              catch (InterruptedException ie)   
              {    
              }    
         }    
    }    
      
    public static void main(String[] args)   
    {    
         final ClassAndObjectLock myt2 = new ClassAndObjectLock();    
         Thread test1 = new Thread(  new Runnable() {  public void run() {  myt2.lockBlkMethod();  }  }, "lockBlkMethod"  );    
         Thread test2 = new Thread(  new Runnable() {  public void run() { myt2.lockMethod();   }  }, "lockMethod"  );    
         test1.start();  
         test2.start();    
    }   
    
}  
