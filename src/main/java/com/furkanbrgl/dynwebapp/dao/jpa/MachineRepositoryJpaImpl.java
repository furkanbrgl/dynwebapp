package com.furkanbrgl.dynwebapp.dao.jpa;

import com.furkanbrgl.dynwebapp.dao.MachineRepository;
import com.furkanbrgl.dynwebapp.model.Machine;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("machineRepositoryJPA")
public class MachineRepositoryJpaImpl implements MachineRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Machine findById(Long id) {
        return entityManager.find(Machine.class, id);
    }

    @Override
    public List<Machine> findByOwnerId(Long ownerId) {
        return entityManager.createNativeQuery("from Machine where owner.id = :ownerId", Machine.class)
                .setParameter("ownerId", ownerId).getResultList();
    }

    @Override
    public void create(Machine machine) {
        entityManager.persist(machine);
    }

    @Override
    public Machine update(Machine machine) {
        return entityManager.merge(machine);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Machine.class, id));
    }

    @Override
    public void deleteByOwnerId(Long ownerId) {

    }

}