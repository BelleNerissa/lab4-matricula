package Serializer;

import java.io.IOException;
import java.util.ArrayList;

import Aluno.Aluno;
import Curso.Curso;
import Disciplina.Disciplina;
import Professor.Professor;

public class PopulateData {
  public static void populate() throws IOException {
    ArrayList<Curso> cursos = new ArrayList<>();
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Professor> professores = new ArrayList<>();
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    Curso curso1 = new Curso(1, "Engenharia de Software", new ArrayList<Integer>(), 8);

    cursos.add(curso1);

    Professor professor1 = new Professor(1, "Maria", "Augusta", "321", new ArrayList<Integer>() {
      {
        add(1);
        add(3);
        add(5);
      }
    });
    Professor professor2 = new Professor(2, "Thiago", "Silva", "123", new ArrayList<Integer>() {
      {
        add(2);
        add(4);
        add(6);
      }
    });

    professores.add(professor1);
    professores.add(professor2);

    Disciplina disciplina1 = new Disciplina(1, "FUNDAMENTOS ENGENHARIA DE SOFTWARE", 200, 1,
        0, new ArrayList<Integer>() {
          {
            add(3);
            add(4);
            add(5);
          }
        }, 1, 1);
    Disciplina disciplina2 = new Disciplina(2, "ALGORITMOS E ESTRUTURAS DE DADOS IV", 200, 1,
        0, new ArrayList<Integer>() {
          {
            add(3);
            add(4);
            add(5);
          }
        }, 2, 1);
    Disciplina disciplina3 = new Disciplina(3, "INTRO. COMPUTADORES", 200, 1,
        0, new ArrayList<Integer>() {
          {
            add(3);
            add(4);
            add(5);
          }
        }, 1, 1);
    Disciplina disciplina4 = new Disciplina(4, "TESTE DE SOFTWARE", 100, 1,
        0, new ArrayList<Integer>() {
          {
            add(3);
            add(4);
            add(5);
          }
        }, 2, 1);
    Disciplina disciplina5 = new Disciplina(5, "INTRODUCAO HUMANO COMPUTADOR", 100, 1,
        1, new ArrayList<Integer>(), 1, 1);
    Disciplina disciplina6 = new Disciplina(6, "GERÊNCIA DE PROJETO", 200, 1, 1,
        new ArrayList<Integer>(), 2, 1);

    disciplinas.add(disciplina1);
    disciplinas.add(disciplina2);
    disciplinas.add(disciplina3);
    disciplinas.add(disciplina4);
    disciplinas.add(disciplina5);
    disciplinas.add(disciplina6);

    Aluno aluno1 = new Aluno(3, "Belle", "Aguiar", "123", 700, new ArrayList<Integer>() {
      {
        add(1);
        add(2);
        add(3);
        add(4);
      }
    });
    Aluno aluno2 = new Aluno(4, "Laura", "Lourdes", "123", 700, new ArrayList<Integer>() {
      {
        add(1);
        add(2);
        add(3);
        add(4);
      }
    });
    Aluno aluno3 = new Aluno(5, "Pedro", "Silva", "123", 700, new ArrayList<Integer>() {
      {
        add(1);
        add(2);
        add(3);
        add(4);
      }
    });

    alunos.add(aluno1);
    alunos.add(aluno2);
    alunos.add(aluno3);

    PersistentData<ArrayList<Curso>> cursoData = new PersistentData<ArrayList<Curso>>(cursos);
    DataSerializer.serialize(cursoData, "data_cursos.ser");

    PersistentData<ArrayList<Aluno>> alunoData = new PersistentData<ArrayList<Aluno>>(alunos);
    DataSerializer.serialize(alunoData, "data_alunos.ser");

    PersistentData<ArrayList<Professor>> professorData = new PersistentData<ArrayList<Professor>>(professores);
    DataSerializer.serialize(professorData, "data_professores.ser");

    PersistentData<ArrayList<Disciplina>> disciplinaData = new PersistentData<ArrayList<Disciplina>>(disciplinas);
    DataSerializer.serialize(disciplinaData, "data_disciplinas.ser");
  }
}
