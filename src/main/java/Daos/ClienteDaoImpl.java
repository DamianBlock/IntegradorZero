package Daos;

import jakarta.persistence.EntityManager;
import Daos.ClienteDao;
import org.example.Cliente;

public class ClienteDaoImpl implements ClienteDao {

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
