package Professor;

import java.util.ArrayList;

import Aluno.Aluno;
import Disciplina.Disciplina;
import Usuario.Usuario;

public class Professor extends Usuario {
    private ArrayList<Integer> disciplinas;

    public Professor(int id, String nome, String sobrenome, String senha, ArrayList<Integer> disciplinas) {
        this.setId(id);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSenha(senha);
        this.disciplinas = disciplinas;
    }

  public void visualizarDisciplinas(
      ArrayList<Disciplina> allDisciplinas,
      ArrayList<Aluno> allAlunos) {
    System.out.println("Disciplinas Lecionada:");
    for (Disciplina disciplina : allDisciplinas) {
      if (this.disciplinas.contains(disciplina.getId())) {
        String cancelada = disciplina.getAlunos().size() < 3 ? " (Cancelada)" : "";
        System.out.println("  - " + disciplina.getNome() + cancelada);
        int count = 0;
        for (Aluno aluno : allAlunos) {
          if (disciplina.getAlunos().contains(aluno.getId())) {
            System.out.println("    - " + aluno.getNome() + " " + aluno.getSobrenome());
            count++;
          }
        }
        if (count == 0) {
          System.out.println("    - Nenhum aluno matriculado");
        }
      }
    }
  }

  public void matricularDisciplinas() {
    System.out.println("Disciplinas:" + this.disciplinas);
  }
}
