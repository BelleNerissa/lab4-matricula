package Professor;

import Aluno.*;
import Disciplina.*;
import Usuario.*;
import java.util.ArrayList;

public class Professor extends Usuario {

  private final ArrayList<Integer> disciplinas;

  public Professor(String nome, String sobrenome, String senha, ArrayList<Integer> disciplinas) {

    this.setId();
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
    this.disciplinas = disciplinas;

  }

  public void visualizarDisciplinas(ArrayList<Disciplina> allDisciplinas, ArrayList<Aluno> allAlunos) {

  }

  public void matricularDisciplinas() {
    System.out.println("Disciplinas:" + this.disciplinas);
  }
}
