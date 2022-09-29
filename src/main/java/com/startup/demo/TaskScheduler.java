package com.startup.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

@SpringBootApplication
public class TaskScheduler implements SchedulingConfigurer, CommandLineRunner {

    public static void main(String[] args){SpringApplication.run(TaskScheduler.class, args);}

  

    @Override
    public void run(String... args) throws Exception {
        CronTask task = this.createCronTask(new Runnable() {
            @Override
            public void run() {
                System.out.println(LocalDateTime.now());
            }
        }, "1/10 * * * * *");

        ScheduledTaskRegistrar taskRegistrar = new ScheduledTaskRegistrar();
        taskRegistrar.addCronTask(task);
        configureTasks(taskRegistrar);
        Thread.sleep(51);

        taskRegistrar.destroy();
        taskRegistrar = null;

        ScheduledTaskRegistrar taskRegistrar2 = new ScheduledTaskRegistrar();
        taskRegistrar2.addCronTask(task);
        configureTasks(taskRegistrar2);

    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        // "Calls scheduleTasks() at bean construction time" - docs
        taskRegistrar.afterPropertiesSet();
    }

    public CronTask createCronTask(Runnable action, String expression) {
        return new CronTask(action, new CronTrigger(expression));
    }

}
