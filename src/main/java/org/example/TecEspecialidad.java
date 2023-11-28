package org.example;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESPECIALIDAD")

public class TecEspecialidad {

    @ManyToOne
    @JoinColumn(name= "TECNICO_idTECNICO", referencedColumnName= "idTECNICO")
    private Tecnico tecnico;

    @OneToOne
    @JoinColumn(name= "idESPECIALIDAD", referencedColumnName= "ESPECIALIDAD_idESPECIALIDAD")
    private TipoProblema tipoProblema;

    @Id
    @Column(name = "idESPECIALIDAD")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTecEspecialidad;

    @Column(name = "nombre_Especialidad")
    private String nombreEspecialidad;

    @Column(name = "descripcion")
    private String descripcionEspecialidad;


}
