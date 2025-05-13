package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.MatriculaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   //O que é o JpaRepository?
public interface MatriculaAlunoRepository extends JpaRepository<MatriculaAluno, Long> {
}
