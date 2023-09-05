package Curso;

import java.util.ArrayList;

public class Curso {

  private int id;
  private static int idGeral = 1;
  private String nome;
  private ArrayList<Integer> disciplinas;
  private int periodos;

  public Curso(String nome, ArrayList<Integer> disciplinas, int periodos) {

    id = idGeral;
    idGeral++;
    this.nome = nome;
    this.disciplinas = disciplinas;
    this.periodos = periodos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Integer> getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(ArrayList<Integer> disciplinas) {
    this.disciplinas = disciplinas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getPeriodos() {
    return periodos;
  }

  public void setPeriodos(int periodos) {
    this.periodos = periodos;
  }
}
