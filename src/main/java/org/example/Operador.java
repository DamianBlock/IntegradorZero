package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "OPERADOR")

public class Operador {

    @Id
    @Column(name = "idOPERADOR")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idOperador;


    @Column(name = "Nombre")
    private String nombreOperador;

    @Column(name = "Apellido")
    private String apellidoOperador;

    @Column(name ="domicilio")
    private String domicilioOperador;

    @Column(name ="telefono")
    private double telefonoOperador;

    @Column(name ="email")
    private String emailOperador;

    @OneToMany
    private List<Incidente> incidentes;

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public String setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
        return nombreOperador;
    }

    public String getApellidoOperador() {
        return apellidoOperador;
    }

    public void setApellidoOperador(String apellidoOperador) {
        this.apellidoOperador = apellidoOperador;
    }

    public String getDomicilioOperador() {
        return domicilioOperador;
    }

    public void setDomicilioOperador(String domicilioOperador) {
        this.domicilioOperador = domicilioOperador;
    }

    public double getTelefonoOperador() {
        return telefonoOperador;
    }

    public void setTelefonoOperador(double telefonoOperador) {
        this.telefonoOperador = telefonoOperador;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
}