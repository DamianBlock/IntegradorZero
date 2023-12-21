package Repositories;

import org.example.Cliente;

public interface ClienteRepository {

    void add(Cliente cliente);

    void update(Cliente cliente);

    void remove(Cliente cliente);

    Cliente get(Long id);
}
