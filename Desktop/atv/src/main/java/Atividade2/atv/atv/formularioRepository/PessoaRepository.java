package Atividade2.atv.atv.formularioRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import Atividade2.atv.atv.pessoaEntity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	

}
