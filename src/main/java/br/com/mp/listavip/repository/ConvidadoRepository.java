package br.com.mp.listavip.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.mp.listavip.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
	
	List<Convidado> findByNome(String nome);
}
