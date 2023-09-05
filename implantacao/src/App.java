import Aluno.Aluno;
import Disciplina.Disciplina;
import Professor.Professor;
import Serializer.DataDeserializer;
import Serializer.DataSerializer;
import Serializer.PopulateData;
import Usuario.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    try {
      // PopulateData.populate();
      ArrayList<Disciplina> disciplinas = DataDeserializer.deserialize(
        "data_disciplinas.ser"
      );
      ArrayList<Aluno> alunos = DataDeserializer.deserialize("data_alunos.ser");
      ArrayList<Aluno> alunosList = alunos;
      ArrayList<Professor> professores = DataDeserializer.deserialize(
        "data_professores.ser"
      );
      List<Usuario> usuarios = new ArrayList<>();
      usuarios.addAll(alunos);
      usuarios.addAll(professores);

      Scanner scanner = new Scanner(System.in);
      Usuario usuarioLogado = fazerLogin(usuarios, scanner);

      if (usuarioLogado == null) {
        System.out.println("Erro ao fazer login!");
      } else {
        System.out.println("Bem-vindo, " + usuarioLogado.getNome() + "!\n");

        if (usuarioLogado instanceof Aluno) {
          Aluno aluno = (Aluno) usuarioLogado;
          exibirDadosAluno(aluno, disciplinas, professores, scanner, alunos);
        } else if (usuarioLogado instanceof Professor) {
          Professor professor = (Professor) usuarioLogado;
          professor.listarDisciplinas(disciplinas, alunos);
        }
      }

      scanner.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  private static Usuario fazerLogin(List<Usuario> usuarios, Scanner scanner) {
    System.out.print("Id: ");
    String id = scanner.nextLine();
    System.out.print("Senha: ");
    String senha = scanner.nextLine();

    for (Usuario usuario : usuarios) {
      if (
        String.valueOf(usuario.getId()).equals(id) &&
        usuario.getSenha().equals(senha)
      ) {
        return usuario;
      }
    }
    return null;
  }

  private static void exibirDadosAluno(
    Aluno aluno,
    ArrayList<Disciplina> disciplinas,
    ArrayList<Professor> professores,
    Scanner scanner,
    ArrayList<Aluno> alunos
  ) throws IOException, ClassNotFoundException {
    System.out.println(
      "Créditos: " + aluno.getCreditos() + " / " + aluno.getQntCreditos() + "\n"
    );
    aluno.visualizarDisciplinas(disciplinas, professores);

    int op;

    do {
      System.out.println("1 - Matricular em disciplina");
      System.out.println("2 - Cancelar matricula em disciplina");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");
      op = scanner.nextInt();
      scanner.nextLine();

      if (op == 1) {
        matricularEmDisciplina(aluno, disciplinas, alunos);
        disciplinas = DataDeserializer.deserialize("data_disciplinas.ser");
        alunos = DataDeserializer.deserialize("data_alunos.ser");
      }
      if (op == 2) {
        cancelarMatricularEmDisciplina(aluno, disciplinas, alunos);
        disciplinas = DataDeserializer.deserialize("data_disciplinas.ser");
        alunos = DataDeserializer.deserialize("data_alunos.ser");
      }
    } while (op != 0);
  }

  private static void matricularEmDisciplina(
    Aluno aluno,
    ArrayList<Disciplina> disciplinas,
    ArrayList<Aluno> alunos
  ) throws IOException {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println(
      "Créditos: " + aluno.getCreditos() + " / " + aluno.getQntCreditos() + "\n"
    );
    System.out.println("Disciplinas disponíveis:");

    for (Disciplina disciplina : disciplinas) {
      System.out.println(
        "  - " +
        disciplina.getId() +
        ": " +
        disciplina.getNome() +
        " (" +
        disciplina.getCreditos() +
        " Créditos)"
      );
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Id da disciplina: ");
    int disciplinaId = scanner.nextInt();
    scanner.nextLine();

    aluno.matricular(disciplinaId, disciplinas, alunos);
  }

  private static void cancelarMatricularEmDisciplina(
    Aluno aluno,
    ArrayList<Disciplina> disciplinas,
    ArrayList<Aluno> alunos
  ) throws IOException {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Id da disciplina: ");
    int disciplinaId = scanner.nextInt();
    scanner.nextLine();

    aluno.cancelarDisciplinas(disciplinaId, aluno.getId(), disciplinas, alunos);
  }
}
