package Daos;

import org.example.Cliente;

public interface ClienteDao {

    void create(Cliente cliente);

    void update(Cliente cliente);

    void delete(String razorSocial);

    Cliente read(Long id);

}
