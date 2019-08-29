package org.asmod.struts2.action;

import org.asmod.struts2.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    public String execute() {
	messageStore = new MessageStore();
	return SUCCESS;
    }

    public MessageStore getMessageStore() {
	return messageStore;
    }
}
