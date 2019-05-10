package com.furkanbrgl.dynwebapp.dao;

import com.furkanbrgl.dynwebapp.model.Machine;

import java.util.List;

public interface MachineRepository {
    Machine findById(Long id);

    List<Machine> findByOwnerId(Long ownerId);

    void create(Machine machine);

    Machine update(Machine machine);

    void delete(Long id);

    void deleteByOwnerId(Long ownerId);
}