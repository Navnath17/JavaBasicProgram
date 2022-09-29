package com.startup.demo;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Job  implements org.quartz.Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("this is second method::");
		cronMethod();
		
	}

	private void cronMethod(){
		int a= 45;
		int b=45;
		int c = a+b;
		
		System.out.println("this is method run"+c);
	}
}
