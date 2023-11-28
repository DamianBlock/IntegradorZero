package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @ManyToMany
    private List<Servicio> servicios;

    @OneToMany
    private List<Incidente> incidente;

    @Id
    @Column(name = "idCliente")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "razonSocial")
    private String razonSocial;

    @Column(name = "cuit")
    private int cuitCliente;

    @Column(name = "CUIL")
    private int cuilCliente;

    @Column(name = "email")
    private int emailCliente;

    @Column(name = "telefono")
    private int telefonoCliente;

    @Column(name = "Fecha_Nacimiento")
    private Date fechaNacCliente;


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public Object setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
        return null;
    }

    public int getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(int cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public int getCuilCliente() {
        return cuilCliente;
    }

    public void setCuilCliente(int cuilCliente) {
        this.cuilCliente = cuilCliente;
    }

    public int getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(int emailCliente) {
        this.emailCliente = emailCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Date getFechaNacCliente() {
        return fechaNacCliente;
    }

    public void setFechaNacCliente(Date fechaNacCliente) {
        this.fechaNacCliente = fechaNacCliente;
    }
}