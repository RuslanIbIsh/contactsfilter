package com.iri.contactsfilter.service.mapper;

import com.iri.contactsfilter.dto.ContactDto;
import com.iri.contactsfilter.model.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactDtoMapper {
    public ContactDto convertToDto(Contact contact) {
        ContactDto contactDto = new ContactDto();
        contactDto.setId(contact.getId());
        contactDto.setName(contact.getName());
        return contactDto;
    }
}
