package Secretaria;

import java.util.ArrayList;

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

  public void gerenciarAluno(ArrayList<Aluno> alunos) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Todos os alunos: ");
    for (Aluno aluno : alunos) {
      System.out.println("    - Aluno: " + aluno.getNome() + " " + aluno.getSobrenome());
    }
  }

  public void gerenciarProfessor(ArrayList<Professor> professores) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Todos os professores: ");
    for (Professor professor : professores) {
      System.out.println("    - Professor: " + professor.getNome() + " " + professor.getSobrenome());
    }
  }

  public void gerenciarDisciplina(ArrayList<Disciplina> disciplinas) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Todos as disciplinas: ");
    for (Disciplina disciplina : disciplinas) {
      System.out.println("    - Disciplina: " + disciplina.getNome() + " ");
    }
  }

  public void gerenciarCurso(ArrayList<Curso> cursos) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Todos os cursos: ");
    for (Curso curso : cursos) {
      System.out.println("    - Curso: " + curso.getNome() + " ");
    }
  }
}