package com.shubh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shubh.entity.Contact;
import com.shubh.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
	
		repo.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContact() {
		 List<Contact> all = repo.findAll();
		return all;
	}

	@Override
	public String deleteContact(int cid) {
		Optional<Contact> findById = repo.findById(cid);
		 if(findById.isPresent()) {
			Contact contact = findById.get();
			contact.setActivesw("N");
			repo.save(contact);
		 }
//		repo.deleteById(cid);
		return "SUCCESS";
	}

	@Override
	public Contact getContact(int cid) {
		 Optional<Contact> findById = repo.findById(cid);
		 if(findById.isPresent()) {
			 return findById.get();
		 }
		 return null;
	}

}
