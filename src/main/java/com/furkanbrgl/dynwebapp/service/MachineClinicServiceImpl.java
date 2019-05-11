package com.furkanbrgl.dynwebapp.service;

import com.furkanbrgl.dynwebapp.dao.OwnerRepository;
import com.furkanbrgl.dynwebapp.exception.OwnerNotFoundException;
import com.furkanbrgl.dynwebapp.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MachineClinicServiceImpl implements MachineClinicService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> findOwners() {
        return ownerRepository.findAll();
    }

    /*
    we dont flush before committing db if readOnly is true. (recommended to getter method because getter methods dont change pojo so just take some data from db)
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Owner> findOwners(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Owner findOwner(Long id) throws OwnerNotFoundException {
        Owner owner = ownerRepository.findById(id);
        if(owner == null) {
            throw new OwnerNotFoundException("Owner not found with id :" + id);
        }
        return owner;
    }

    @Override
    public void createOwner(Owner owner) {
        ownerRepository.create(owner);
    }

    @Override
    public void updateOwner(Owner owner) {
        ownerRepository.update(owner);
    }

    @Override
    public void deleteOwner(Long id) {
        ownerRepository.delete(id);
    }

}