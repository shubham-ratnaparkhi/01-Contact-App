package com.shubh.service;

import java.util.List;

import com.shubh.entity.Contact;


public interface ContactService {
	
	String upsert(Contact contact);
	
	List<Contact> getAllContact();
	
	String deleteContact(int cid);
	
	Contact getContact(int cid);

}
