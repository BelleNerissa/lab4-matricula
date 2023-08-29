package implantacao.Professor;

import implantacao.Aluno.*;
import implantacao.Disciplina.*;
import implantacao.Usuario.*;
import java.util.ArrayList;

public class Professor extends Usuario {

  private ArrayList<Integer> disciplinas;

  public Professor(
    int id,
    String nome,
    String sobrenome,
    String senha,
    ArrayList<Integer> disciplinas
  ) {
    this.setId(id);
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
    this.disciplinas = disciplinas;
  }

  public void visualizarDisciplinas(
    ArrayList<Disciplina> allDisciplinas,
    ArrayList<Aluno> allAlunos
  ) {}

  public void matricularDisciplinas() {
    System.out.println("Disciplinas:" + this.disciplinas);
  }
}
