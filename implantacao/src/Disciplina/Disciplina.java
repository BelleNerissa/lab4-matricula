package Disciplina;

import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable {

  private int id;
  private static int idGeral = 1;
  private String nome;
  private int creditos;
  private int periodo;
  private int tipo; // 0 - Obrigatória, 1 - Optativa
  private ArrayList<Integer> alunos;
  private int professor;
  private int cursoID;

  public Disciplina(String nome, int creditos, int periodo, int tipo, ArrayList<Integer> alunos, int professor, int cursoID) {

    id = idGeral;
    idGeral++;
    this.nome = nome;
    this.creditos = creditos;
    this.periodo = periodo;
    this.tipo = tipo;
    this.alunos = alunos;
    this.professor = professor;
    this.cursoID = cursoID;

  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getPeriodo() {
    return periodo;
  }

  public ArrayList<Integer> getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList<Integer> alunos) {
    this.alunos = alunos;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getCursoID() {
    return cursoID;
  }

  public int getProfessor() {
    return professor;
  }

  public void setProfessor(int professor) {
    this.professor = professor;
  }

  public int getTipo() {
    return tipo;
  }

  public void setCursoID(int cursoID) {
    this.cursoID = cursoID;
  }

  public void setPeriodo(int periodo) {
    this.periodo = periodo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }
}
