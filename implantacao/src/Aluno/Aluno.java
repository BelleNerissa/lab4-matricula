package Aluno;

import Usuario.*;
import java.util.ArrayList;

public class Aluno extends Usuario {

  private int QntCreditos = 1000;
  private int creditos = 0;
  private ArrayList<Integer> disciplinas;

  public Aluno(
    int id,
    String nome,
    String sobrenome,
    String senha,
    int creditos,
    ArrayList<Integer> disciplinas
  ) {
    this.setId(id);
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
    this.creditos = creditos;
    this.disciplinas = disciplinas;
  }

  public void setQntCreditos(int creditos) {
    this.QntCreditos = creditos;
  }

  public int getQntCreditos() {
    return this.QntCreditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getCreditos() {
    return this.creditos;
  }

  public ArrayList<Integer> getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(ArrayList<Integer> disciplinas) {
    this.disciplinas = disciplinas;
  }

  public void visualizarDisciplinas(int idAluno) {}

  public void cancelarDisciplinas(int idDisciplina, int idAluno) {}

  public void matricular(int idDisciplina, int idAluno) {}
}
