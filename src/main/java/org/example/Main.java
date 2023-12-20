package org.example;

import Repositories.ClienteRepository;
import Repositories.ClienteRepositoryImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Main {
        public static EntityManager getEntityManager() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
            EntityManager manager = factory.createEntityManager();
            return manager;
        }

        public static void main(String[] args) {
            EntityManager em = getEntityManager();
            EntityTransaction tx = em.getTransaction();


            tx.begin();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           /* Operador operador = new Operador(); //← Seteamos todos los atributos
            em.persist(operador.setNombreOperador("Juan")); */
          //  Cliente cliente = new Cliente(100, "1000",50, "Damian Juarez",156171541,2033973560,"damianfrt25@gmail.com");
            Cliente cliente = new Cliente();
            cliente.setCuilCliente("20339735604");
            cliente.setRazonSocial("Damian Juarez");
            cliente.setEmailCliente("damianfrt25@gmail.com");
            cliente.setTelefonoCliente(1516171541);
            cliente.setFechaNacCliente(new Date(1988-05));
            em.persist(cliente);


            tx.commit();


           /*   Cliente c1 = new Cliente();
            c1.setCuitCliente(34310152);
            c1.setRazonSocial("Alan Casas");
            c1.setCuilCliente(2034310524);
            c1.setEmailCliente("alan.casas@gmail.com"); */

           /* ClienteRepository clienteRepository = new ClienteRepository();
            clienteRepository.add(c1);*/


            System.out.println("\nConexión establecida con exito");
        }
    }
