package com.jaimerojas.springboot.error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jaimerojas.springboot.error.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<Usuario>();
		this.lista.add(new Usuario(1, "Jaime", "Rojas"));
		this.lista.add(new Usuario(2, "Mariano", "Monsalve"));
		this.lista.add(new Usuario(3, "Ester", "Rodriguez"));
		this.lista.add(new Usuario(4, "Julio", "González"));
		this.lista.add(new Usuario(5, "Carmen", "Arce"));
		this.lista.add(new Usuario(6, "Marta", "Marambio"));
		this.lista.add(new Usuario(7, "Juan", "Reyes"));

	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {

		Usuario resultado = null;

		for (Usuario u : this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}

		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {

		Usuario usuario = this.obtenerPorId(id);

		return Optional.ofNullable(usuario);
	}

}
