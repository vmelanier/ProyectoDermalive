package com.dermalive.tienda.models;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class Apartado {

    @Id
    @Column(name="id",updatable = false, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable=false)
    private String title;

    @Column(name="email", nullable=false)
    private String email;

    @Column(name="telefono", nullable=false)
    private String telefono;

    public Long getId (){
        return id;
    }

    public String setTitle(String title) {
        return title;
	}

	public String setTelefono(String telefono) {
        return telefono;
	}

	public String setEmail(String email) {
        return email;

	}

}