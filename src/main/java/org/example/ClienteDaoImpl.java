package org.example;

import jakarta.persistence.EntityManager;

public class ClienteDaoImpl implements ClienteDao{

    public ClienteDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private final EntityManager entityManager;

    @Override
    public void create(Cliente cliente) {
        entityManager.persist(Cliente.class);

    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public void delete(String razorSocial) {

    }

    @Override
    public Cliente read(Long id) {
        return null;
    }
}
