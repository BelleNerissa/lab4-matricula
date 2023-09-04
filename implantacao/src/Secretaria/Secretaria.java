package Secretaria;

import Aluno.Aluno;
import Curso.Curso;
import Disciplina.Disciplina;
import Professor.Professor;
import Usuario.Usuario;

public class Secretaria extends Usuario {

  public Secretaria(int id, String nome, String sobrenome, String senha) {
    this.setId(id);
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
  }

  private void gerenciarAluno(Aluno aluno, int op) {
    if (op == 1) {
      System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
    } else if (op == 2) {
      System.out.println("Aluno " + aluno.getNome() + " removido com sucesso!");
    }
  }

  private void gerenciarProfessor(Professor professor, int op) {
    if (op == 1) {
      System.out.println("Professor " + professor.getNome() + " cadastrado com sucesso!");
    } else if (op == 2) {
      System.out.println("Professor " + professor.getNome() + " removido com sucesso!");
    }
  }

  private void gerenciarDisciplina(Disciplina disciplina, int op) {
    if (op == 1) {
      System.out.println("Disciplina " + disciplina.getNome() + " cadastrada com sucesso!");
    } else if (op == 2) {
      System.out.println("Disciplina " + disciplina.getNome() + " removida com sucesso!");
    }
  }

  private void gerenciarCurso(Curso cursoID, int op) {
    if (op == 1) {
      System.out.println("Curso " + cursoID.getNome() + " cadastrado com sucesso!");
    } else if (op == 2) {
      System.out.println("Curso " + cursoID.getNome() + " removido com sucesso!");
    }
  }
}
