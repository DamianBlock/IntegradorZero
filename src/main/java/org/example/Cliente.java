package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    private String cuitCliente;

    @Column(name = "CUIL")
    private String cuilCliente;

    @Column(name = "email")
    private String emailCliente;

    @Column(name = "telefono")
    private long telefonoCliente;

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

    public String getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(String cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public String getCuilCliente() {
        return cuilCliente;
    }

    public void setCuilCliente(String cuilCliente) {
        this.cuilCliente = cuilCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public double getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(long telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Date getFechaNacCliente() {
        return fechaNacCliente;
    }

    public void setFechaNacCliente(Date fechaNacCliente) {
        this.fechaNacCliente = fechaNacCliente;
    }

 /*   public void setFechaNacCliente(LocalDate parse) {
        this.fechaNacCliente = fechaNacCliente;
    }*/
}