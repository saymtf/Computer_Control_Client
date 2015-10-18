package com.saymtfmtfmtf.runnable;


import com.saymtfmtfmtf.core.Client;
import com.saymtfmtfmtf.view.Interface;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Main{
	public static void main(String[] args) throws IOException{
		ScheduledThreadPoolExecutor threadPoolExe = new ScheduledThreadPoolExecutor(5);


		//Time time = new Time();

		Interface inter = new Interface();
		Client server = new Client();
		
		//server.startServer(); // Start Server
        //threadPoolExe.scheduleWithFixedDelay(time, 1, 1, TimeUnit.SECONDS);
        threadPoolExe.scheduleWithFixedDelay(inter, 1, 1, TimeUnit.SECONDS);
        
        new Thread(inter).start();
	}
}
