package br.com.senai.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.teste.model.aluno;

public interface AlunoRepository 
        extends JpaRepository<aluno, Integer> {

}
