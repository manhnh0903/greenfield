package com.ms;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
@author nakuls
*/
public class AppContextListener implements ApplicationListener<ContextRefreshedEvent> {

	public void onApplicationEvent(ContextRefreshedEvent event) {
		// whatever you want to do when app context is initialized or refreshed
		System.out.println("Here we are in listener..");
	}
}
