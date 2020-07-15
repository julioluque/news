package com.jluque.news.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usr_id")
	private int id;

	@Column(name = "usr_nombre")
	private String nombre;

	@Column(name = "usr_comentario")
	private String comentario;

	@Column(name = "usr_fecha")
	private LocalDate fecha;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nombre, String comentario, LocalDate fecha) {
		this.id = id;
		this.nombre = nombre;
		this.comentario = comentario;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", comentario=" + comentario + ", fecha=" + fecha + "]";
	}

}
