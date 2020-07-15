package com.jluque.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jluque.news.entities.Usuario;
import com.jluque.news.service.UsuarioServiceImpl;

@RestController
@RequestMapping(path = "/news")
public class UsuarioController {

	@Autowired
	private UsuarioServiceImpl service;

	@GetMapping(value = "/ver")
	public Iterable<Usuario> getAll() {
		return service.getAll();
	}

	@PostMapping(value = "/nuevo")
	public Usuario create(@RequestBody Usuario usuario) {
		return service.create(usuario);
	}
}
