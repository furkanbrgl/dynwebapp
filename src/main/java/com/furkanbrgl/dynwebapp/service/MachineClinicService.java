package com.furkanbrgl.dynwebapp.service;

import com.furkanbrgl.dynwebapp.exception.OwnerNotFoundException;
import com.furkanbrgl.dynwebapp.model.Owner;

import java.util.List;

public interface MachineClinicService {
    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id) throws OwnerNotFoundException;
    void createOwner(Owner owner);
    void updateOwner(Owner owner);
    void deleteOwner(Long id);
}
