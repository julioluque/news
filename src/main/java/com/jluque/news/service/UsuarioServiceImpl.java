package com.jluque.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jluque.news.entities.Usuario;
import com.jluque.news.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository repository;

	@Override
	public Iterable<Usuario> getAll() {
		return repository.findAll();
	}

	@Override
	public Usuario findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Usuario create(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);

	}

}
