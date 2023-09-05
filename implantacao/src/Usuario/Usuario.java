package Usuario;

import java.io.Serializable;

public abstract class Usuario implements Serializable {

    private int id;
    private static int idGeral = 1;
    private String nome;
    private String sobrenome;
    private String senha;

    public void setId() {
        this.id = idGeral;
        idGeral++;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }
}
