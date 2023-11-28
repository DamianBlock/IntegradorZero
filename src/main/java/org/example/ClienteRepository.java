package org.example;

public interface ClienteRepository {

    void add(Cliente cliente);

    void remove(Cliente cliente);

    void update(Cliente cliente);

    Cliente get(Long id);
}
