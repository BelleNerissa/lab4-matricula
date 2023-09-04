package Curso;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {

  private int id;
  private String nome;
  private int periodos;
  private ArrayList<Integer> disciplinas;

  public Curso(
    int id,
    String nome,
    ArrayList<Integer> disciplinas,
    int periodos
  ) {
    this.id = id;
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
