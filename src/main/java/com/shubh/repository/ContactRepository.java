package com.shubh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubh.entity.Contact;

public interface ContactRepository  extends JpaRepository<Contact, Integer>{

}
