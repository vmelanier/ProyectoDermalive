package com.dermalive.tienda.models;
import javax.persistence.*;

@Entity
@Table(name = "apartado")
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

    public String getTitle() {
        return title;
	}

	public String getTelefono() {
        return telefono;
	}

	public String getEmail() {
        return email;

    }
    public void setTitle(String title) {
        this.title=title;
	}

	public void setTelefono(String telefono) {
        this.telefono=telefono;
	}

	public void setEmail(String email) {
        this.email=email;
    }

}