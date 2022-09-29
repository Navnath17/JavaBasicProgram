package com.startup.demo;


import java.text.ParseException;

import org.apache.log4j.BasicConfigurator;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
 
 

public class JobScheduler {

      
    private static Scheduler scheduler;  
      
    public static void main(String args[]) throws Exception {  
          
        BasicConfigurator.configure();  
          
        //initialize scheduler instance from Quartz  
        scheduler = new StdSchedulerFactory().getScheduler();  
          
        //start scheduler  
        scheduler.start();  
          
          
        //create scheduler trigger with a cron expression  
        Trigger triggerNew = createCronTrigger();  
          
        //schedule trigger  
        scheduleJob(triggerNew);  
   
    }  
      
    //create scheduleJob() method to schedule a job  
    private static void scheduleJob(Trigger triggerNew) throws Exception {  
          
        //create an instance of the JoDetails to connect Quartz job to the CreateQuartzJob  
        JobDetail jobInstance = JobBuilder.newJob(Job.class).build();  
          
        //invoke scheduleJob method to connect the Quartz scheduler to the jobInstance and the triggerNew  
        scheduler.scheduleJob(jobInstance, triggerNew);  
   
    }  
      
    //create createTrigger() method that returns a trigger based on the time interval  
    private static Trigger createCronTrigger() throws ParseException { 
         
        //create cron expression 
        String CRON_EXPRESSION = "0 53 14 28 9 ?"; 
         
        //create a trigger to be returned from the method 
        Trigger triggerNew = TriggerBuilder.newTrigger()
                .withSchedule(CronScheduleBuilder.cronSchedule(CRON_EXPRESSION)).build(); 
         
        //return triggerNew to schedule it in main() method 
        return triggerNew; 
    } 
    
      

 
}