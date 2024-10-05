package com.contact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.dto.ContactDto;
import com.contact.models.Conatct;
import com.contact.repo.ContactRep;

@Service
public class ServiceImpl implements ConService{

    @Autowired
    private ContactRep contactRep;

    @Override
    public String createContact(ContactDto contactDto) {
        Conatct conatct =new Conatct();
        conatct.setEmail(contactDto.getEmail());
        conatct.setPhoneNumber(contactDto.getPhone_number());
        conatct.setUserId(contactDto.getUser_id());
        contactRep.save(conatct);
        return "Contact Created Successfully";
    }

    @Override
    public List<Conatct> getcontact(Long id) {
        List<Conatct> conatcts =contactRep.findAllByUserId(id);
        return conatcts;
    }
    
}
