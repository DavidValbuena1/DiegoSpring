package com.proyecto.sioca.entity;

import javax.persistence.*;

@Entity
@Table(name="ordencompra")
public class Orden {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fecha;

    @Column
    private Proveedor proveedor;

    @Column
    private String estado;

    @Column(name="valortotal")
    private int valor;

}
