package br.com.mp.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mp.listavip.model.Convidado;
import br.com.mp.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public Iterable<Convidado> obterTodos() {
		return repository.findAll();
	}
	
	public void salvar(Convidado convidado) {
		repository.save(convidado);
	}

}
