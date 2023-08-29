package Professor;

import Aluno.*;
import Disciplina.*;
import Usuario.*;
import java.util.ArrayList;

public class ProfessorTest extends Professor {

  public ProfessorTest(
    int id,
    String nome,
    String sobrenome,
    String senha,
    ArrayList<Integer> disciplinas
  ) {
    super(id, nome, sobrenome, senha, disciplinas);
  }

  @Override
  public void visualizarDisciplinas(
    ArrayList<Disciplina> allDisciplinas,
    ArrayList<Aluno> allAlunos
  ) {
    // Implementação vazia, pois é um stub
  }

  @Override
  public void matricularDisciplinas() {
    System.out.println("Stub: Disciplinas:" + this.disciplinas);
  }
}
