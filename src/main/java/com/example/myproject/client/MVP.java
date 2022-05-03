package com.example.myproject.client;



import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;

import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MVP implements EntryPoint {
	EventBus eventBus = new SimpleEventBus();
	AppController appViewer;

	
	public void onModuleLoad() {
		
		
		final InputServicesAsync inputServices=GWT.create(InputServices.class);
		 appViewer = new AppController(inputServices, eventBus);
		 appViewer.goTo(RootPanel.get());
		
	}
}
