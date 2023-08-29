package Secretaria;

import Usuario.Usuario;

public class SecretariaTest extends Secretaria {

  public SecretariaTest(int id, String nome, String sobrenome, String senha) {
    super(id, nome, sobrenome, senha);
  }

  @Override
  private void gerenciarAluno(int aluno, int op) {
    // Implementação vazia, pois é um stub
  }

  @Override
  private void gerenciarProfessor(int professorID, int op) {
    // Implementação vazia, pois é um stub
  }

  @Override
  private void gerenciarCurso(int cursoID, int op) {
    // Implementação vazia, pois é um stub
  }

  @Override
  private void gerenciarCurso(int cursoID) {
    // Implementação vazia, pois é um stub
  }
}
