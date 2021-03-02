package com.iri.contactsfilter.service.impl;

import com.iri.contactsfilter.model.Contact;
import com.iri.contactsfilter.repository.ContactDao;
import com.iri.contactsfilter.service.ContactService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    private ContactDao contactDao;

    public ContactServiceImpl(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    @Override
    public List<Contact> findAllNotMatchRegExp(String regExp) {
        return contactDao.findAll().stream()
                .parallel()
                .filter(contact -> !contact.getName().matches(regExp))
                .collect(Collectors.toList());
    }
}
