package Repositories;

import org.example.Cliente;
import Daos.ClienteDaoImpl;

public class ClienteRepositoryImpl implements ClienteRepository {
    private ClienteDaoImpl clienteDao;
    @Override
    public void add(Cliente cliente) {
        clienteDao.create(cliente);

    }

    @Override
    public void remove(Cliente cliente) {

    }

    @Override
    public void update(Cliente cliente) {

    }

    @Override
    public Cliente get(Long id) {
        return null;
    }
}
