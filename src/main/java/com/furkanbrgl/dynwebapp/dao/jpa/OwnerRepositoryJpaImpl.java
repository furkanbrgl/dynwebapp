package com.furkanbrgl.dynwebapp.dao.jpa;

import com.furkanbrgl.dynwebapp.dao.OwnerRepository;
import com.furkanbrgl.dynwebapp.model.Owner;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("ownerRepositoryJPA")
public class OwnerRepositoryJpaImpl implements OwnerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Owner findById(Long id) {
        return entityManager.find(Owner.class, id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return entityManager.createNativeQuery("from Owner where lastName = :lastName", Owner.class)
                .setParameter("lastName", lastName).getResultList();
    }

    @Override
    public List<Owner> findAll() {
        return entityManager.createNativeQuery("from Owner", Owner.class).getResultList();
    }

    @Override
    public void create(Owner owner) {
        entityManager.persist(owner);
    }

    @Override
    public Owner update(Owner owner) {
        return entityManager.merge(owner);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Owner.class, id));
    }

}