package org.example;

public interface ClienteDao {

    void create(Cliente cliente);

    void update(Cliente cliente);

    void delete(String razorSocial);

    Cliente read(Long id);

}
