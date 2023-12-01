package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

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
           /* Operador operador = new Operador(); //← Seteamos todos los atributos
            em.persist(operador.setNombreOperador("Juan")); */
            Cliente cliente = new Cliente();
            em.persist(cliente);
            tx.commit();


            /*  Cliente c1 = new Cliente();
            c1.setDniCliente(34310152);
            c1.setNombreYApellidoCliente("Alan Casas");
            c1.setDireccionCliente("avenida falsa 123");
            c1.setLocalidadCliente("Bs.As");

            clienteRepositorioImp.agregarCliente(c1);
            */

            System.out.println("\n Conexión establecida");
        }
    }
