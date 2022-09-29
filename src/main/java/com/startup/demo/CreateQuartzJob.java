package com.startup.demo;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
 
public class CreateQuartzJob implements Job {
	
      
    //execute Job by using execute() method of the Job interface  
    public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {//handle JobExecutionException  
          
    	System.out.println("navnath kahatkar:: is here");
    }
}