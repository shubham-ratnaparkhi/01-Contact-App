package com.shubh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shubh.entity.Contact;
import com.shubh.service.ContactServiceImpl;

@RestController
public class ConatctRestController {

	@Autowired
	private ContactServiceImpl impl;

	@PostMapping(path = "/contact")
	public ResponseEntity<String> upsert(@RequestBody Contact contact) {
		String upsert = impl.upsert(contact);
		return new ResponseEntity<>(upsert, HttpStatus.CREATED);
	}

	@GetMapping(path = "/contacts")
	public ResponseEntity<List<Contact>> getAllContact() {
		List<Contact> list = impl.getAllContact();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@DeleteMapping(path="/contact/{cid}")
	public ResponseEntity<String> deleteContact(@PathVariable int cid) {
		String deleteContact = impl.deleteContact(cid);
		return new ResponseEntity<>(deleteContact, HttpStatus.OK);
	}
	
	@GetMapping(path="/contact/{cid}")
	public ResponseEntity<Contact> getContact(@PathVariable int cid){		
		Contact contact = impl.getContact(cid);
		return new ResponseEntity<>(contact,HttpStatus.OK);
		
	}

}
