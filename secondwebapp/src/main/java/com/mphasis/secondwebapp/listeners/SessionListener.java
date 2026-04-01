package com.mphasis.secondwebapp.listeners;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionIdListener;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionAttributeListener, HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(se.getSession().getId() + " Session Started");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession().getId() + " Session Destroyed");
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+" , "+event.getValue() + " Attribute Added");
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+" , "+event.getValue() + " Attribute Removed");

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(event.getName() + " Attribute Removed");

	}

}
