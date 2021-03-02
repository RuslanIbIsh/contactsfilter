package com.iri.contactsfilter.service;

import com.iri.contactsfilter.model.Contact;
import java.util.List;

public interface ContactService {
    List<Contact> findAllNotMatchRegExp(String regExp);
}
