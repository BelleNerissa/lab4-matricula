package Aluno;

import Usuario.*;
import java.util.ArrayList;

public class Aluno extends Usuario {

  private int QntCreditos = 1000;
  private int creditos = 0;
  private ArrayList<Integer> disciplinasOpt;
  private ArrayList<Integer> disciplinasObg;

  public Aluno(
    int id,
    String nome,
    String sobrenome,
    String senha,
    int creditos,
    ArrayList<Integer> disciplinasOpt,
    ArrayList<Integer> disciplinasObg
  ) {
    this.setId(id);
    this.setNome(nome);
    this.setSobrenome(sobrenome);
    this.setSenha(senha);
    this.creditos = creditos;
    this.disciplinasOpt = disciplinasOpt;
    this.disciplinasObg = disciplinasObg;
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

  public ArrayList<Integer> getDisciplinasObg() {
    return disciplinasObg;
  }

  public void setDisciplinasObg(ArrayList<Integer> disciplinasObg) {
    this.disciplinasObg = disciplinasObg;
  }

  public ArrayList<Integer> getDisciplinasOpt() {
    return disciplinasOpt;
  }

  public void setDisciplinasOpt(ArrayList<Integer> disciplinasOpt) {
    this.disciplinasOpt = disciplinasOpt;
  }

  public void visualizarDisciplinas(int idAluno) {}

  public void cancelarDisciplinas(int idDisciplina, int idAluno) {}

  public void matricular(int idDisciplina, int idAluno) {}
}
