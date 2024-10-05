package com.contact.services;

import java.util.List;

import com.contact.dto.ContactDto;
import com.contact.models.Conatct;

public interface ConService {

   String createContact(ContactDto contactDto);
   List<Conatct> getcontact(Long id);
    
}
