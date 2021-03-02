package com.iri.contactsfilter.repository;

import com.iri.contactsfilter.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends JpaRepository<Contact, Long> {
}
