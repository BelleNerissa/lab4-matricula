package Secretaria;

import Usuario.Usuario;

public class Secretaria extends Usuario {

  public Secretaria(int id, String nome, String sobrenome, String senha) {
    this.setId(id);
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
  }

  private void gerenciarAluno(int aluno, int op) {}
  private void gerenciarProfessor(int professorID, int op) {}
  private void gerenciarCurso(int cursoID, int op) {}
  private void gerenciarCurso(int cursoID) {}
}
