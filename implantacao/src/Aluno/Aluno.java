package Aluno;

import Disciplina.Disciplina;
import Professor.Professor;
import Serializer.DataSerializer;
import Serializer.PersistentData;
import Usuario.*;
import java.io.IOException;
import java.io.IOException;
import java.util.ArrayList;

import Disciplina.Disciplina;
import Professor.Professor;
import Serializer.DataSerializer;
import Serializer.PersistentData;

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
      ArrayList<Integer> disciplinas) {

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

  public void visualizarDisciplinas(ArrayList<Disciplina> allDisciplinas, ArrayList<Professor> allProfessores) {
    System.out.println("Disciplinas:");
    for (Disciplina disciplina : allDisciplinas) {
      if (this.disciplinas.contains(disciplina.getId())) {
        String cancelada = disciplina.getAlunos().size() < 3 ? " (Cancelada)" : "";
        System.out.println("  - " + disciplina.getNome() + " (" + disciplina.getCreditos()
            + " Creditos) " + cancelada);
        for (Professor professor : allProfessores) {
          if (disciplina.getProfessor() == professor.getId()) {
            System.out.println("    - Professor: " + professor.getNome() + " " + professor.getSobrenome());
          }
        }
      }
    }
  }

  public void cancelarDisciplinas(ArrayList<Disciplina> allDisciplinas, ArrayList<Aluno> allAlunos, int idDisciplina)
      throws IOException {
    boolean encontrouDisciplina = false;
    int creditosRemovidos = 0;
    for (int i = 0; i < disciplinas.size(); i++) {
      if (disciplinas.get(i) == idDisciplina) {
        encontrouDisciplina = true;
        int disciplinaCreditos = 0;

        for (Disciplina disciplina : allDisciplinas) {
          if (disciplina.getId() == idDisciplina) {
            disciplinaCreditos = disciplina.getCreditos();
            disciplina.getAlunos().remove(Integer.valueOf(this.getId()));
            break;
          }
        }

        setCreditos(this.creditos - disciplinaCreditos);
        creditosRemovidos = disciplinaCreditos;

        disciplinas.remove(i);

        for (Disciplina disciplina : allDisciplinas) {
          if (disciplina.getId() == idDisciplina) {
            disciplina.setAlunos(disciplina.getAlunos());
            break;
          }
        }

        for (Aluno aluno : allAlunos) {
          if (aluno.getId() == this.getId()) {
            aluno.setDisciplinas(disciplinas);
            aluno.setCreditos(aluno.getCreditos() - creditosRemovidos);
            break;
          }
        }

        PersistentData<ArrayList<Aluno>> alunoData = new PersistentData<ArrayList<Aluno>>(allAlunos);
        DataSerializer.serialize(alunoData, "data_alunos.ser");

        PersistentData<ArrayList<Disciplina>> disciplinaData = new PersistentData<ArrayList<Disciplina>>(
            allDisciplinas);
        DataSerializer.serialize(disciplinaData, "data_disciplinas.ser");

        System.out.println("Matrícula na disciplina cancelada com sucesso!");
        break;
      }
    }

    if (!encontrouDisciplina) {
      System.out.println("Você não está matriculado nesta disciplina!");
    }
  }

  public void matricular(int idDisciplina, ArrayList<Disciplina> allDisciplinas,
      ArrayList<Aluno> allAlunos) throws IOException {
    disciplinas.add(idDisciplina);

    for (Disciplina disciplina : allDisciplinas) {
      if (disciplina.getId() == idDisciplina) {
        if (this.disciplinas.contains(idDisciplina)) {
          System.out.println("Voce ja esta matriculado nesta disciplina!");
          return;
        }

        if (this.disciplinas.size() == 6) {
          System.out.println("Voce ja esta matriculado em 6 disciplinas!");
          return;
        }

        if (this.creditos + disciplina.getCreditos() > this.creditos) {
          System.out.println("Voce nao tem creditos suficientes para se matricular nesta disciplina!");
          return;
        }

        disciplina.getAlunos().add(this.getId());
        setCreditos(this.creditos += disciplina.getCreditos());
      }

    }
    for (Aluno aluno : allAlunos) {
      if (aluno.getId() == this.getId()) {
        aluno.setDisciplinas(disciplinas);
        aluno.setCreditos(this.creditos);
      }
    }

    for (Disciplina disciplina : allDisciplinas) {
      if (disciplina.getId() == idDisciplina) {
        disciplina.setAlunos(disciplina.getAlunos());
      }
    }

    PersistentData<ArrayList<Aluno>> alunoData = new PersistentData<ArrayList<Aluno>>(allAlunos);
    DataSerializer.serialize(alunoData,
        "C:\\Users\\belle\\Documents\\PUC\\Lab4\\lab4-matricula\\implantacao\\data_alunos.ser");

    PersistentData<ArrayList<Disciplina>> disciplinaData = new PersistentData<ArrayList<Disciplina>>(
        allDisciplinas);
    DataSerializer.serialize(disciplinaData,
        "C:\\Users\\belle\\Documents\\PUC\\Lab4\\lab4-matricula\\implantacao\\data_disciplinas.ser");

    System.out.println("Matricula realizada com sucesso!");
  }

}
