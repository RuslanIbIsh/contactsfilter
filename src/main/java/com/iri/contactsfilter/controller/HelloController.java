package com.iri.contactsfilter.controller;

import com.iri.contactsfilter.dto.ContactDto;
import com.iri.contactsfilter.service.ContactService;
import com.iri.contactsfilter.service.mapper.ContactDtoMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private ContactService contactService;
    private ContactDtoMapper contactDtoMapper;

    public HelloController(ContactService contactService, ContactDtoMapper contactDtoMapper) {
        this.contactService = contactService;
        this.contactDtoMapper = contactDtoMapper;
    }

    @GetMapping("/contacts")
    public List<ContactDto> getContactsNotMatchFilter(@RequestParam String nameFilter) {
        return contactService.findAllNotMatchRegExp(nameFilter).stream()
                .map(contact -> contactDtoMapper.convertToDto(contact))
                .collect(Collectors.toList());
    }
}
