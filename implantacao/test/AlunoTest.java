package Aluno;

import Usuario.*;
import java.util.ArrayList;

public class AlunoTest extends Aluno {

  public AlunoTest(
    int id,
    String nome,
    String sobrenome,
    String senha,
    int creditos,
    ArrayList<Integer> disciplinasOpt,
    ArrayList<Integer> disciplinasObg
  ) {
    super(id, nome, sobrenome, senha, creditos, disciplinasOpt, disciplinasObg);
  }

  @Override
  public void visualizarDisciplinas(int idAluno) {
    // Implementação vazia, pois é um stub
  }

  @Override
  public void cancelarDisciplinas(int idDisciplina, int idAluno) {
    // Implementação vazia, pois é um stub
  }

  @Override
  public void matricular(int idDisciplina, int idAluno) {
    // Implementação vazia, pois é um stub
  }
}
