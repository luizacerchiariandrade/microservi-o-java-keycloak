package com.msvc.usuario.entities;

import javax.persistence.Id;

public class Hotel {
    @Id
    private String id;
    private String nombre;
    private String ubicacion;
    private String informacion;
}
