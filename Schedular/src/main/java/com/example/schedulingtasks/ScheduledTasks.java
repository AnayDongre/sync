package com.example.schedulingtasks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	@Scheduled(fixedRate = 3000)
	public void reportCurrentTime() {
		log.info("Hi every 3 seconds");
	}
}