package com.jluque.news.service;

import com.jluque.news.entities.Usuario;

public interface IUsuarioService {

	public Iterable<Usuario> getAll();

	public Usuario getById(int id);

	public Usuario create(Usuario usuario);

	public void update(Usuario usuario);

	public void delete(int id);
}
