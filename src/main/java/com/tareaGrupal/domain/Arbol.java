package com.tareaGrupal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name ="arbol")
public class Arbol implements Serializable{
    //Versión de serialización
    private static final long serialVersionUID = 1L;
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private Long idCategoria;
    @Column(name ="nombre_comun")
    private String nombreComun;
    @Column(name ="tipo_flor")
    private String tipoFlor;
    @Column(name ="dureza_madera")
    private String durezaMadera;
    @Column(name ="altura_promedio")
    private Double alturaPromedio;
    @Column(name ="esperanza_vida")
    private int esperanzaVida;
    @Column(name ="region_origen")
    private String regionOrigen;
    @Column(name ="ruta_imagen")
    private String rutaImagen;
    
    //Constructor
    public Arbol() {}

    public Arbol(String nombreComun, String tipoFlor, String durezaMadera, Double alturaPromedio, int esperanzaVida, String regionOrigen, String rutaImagen) {
        this.nombreComun = nombreComun;
        this.tipoFlor = tipoFlor;
        this.durezaMadera = durezaMadera;
        this.alturaPromedio = alturaPromedio;
        this.esperanzaVida = esperanzaVida;
        this.regionOrigen = regionOrigen;
        this.rutaImagen = rutaImagen;
    }
    
    
}
