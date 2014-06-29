package model.beans;

public class UsuarioBean {
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String nivel;
    
    public UsuarioBean(String nome, String login, String senha, String email,String nivel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
