// Invitado.java

package com.example.boda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invitado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private Boolean acompanante;
    private String restriccionesAlimenticias;
    private Boolean vegetariano;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Boolean getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(Boolean acompanante) {
        this.acompanante = acompanante;
    }

    public String getRestriccionesAlimenticias() {
        return restriccionesAlimenticias;
    }

    public void setRestriccionesAlimenticias(String restriccionesAlimenticias) {
        this.restriccionesAlimenticias = restriccionesAlimenticias;
    }

    public Boolean getVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(Boolean vegetariano) {
        this.vegetariano = vegetariano;
    }
}
