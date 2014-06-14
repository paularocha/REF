

package model.beans;

public class EspacoBean {
    private String nome;
    private String informacoes;
    private boolean confirmavel;

    public EspacoBean(String nome, String informacoes, boolean confirmavel) {
        this.nome = nome;
        this.informacoes = informacoes;
        this.confirmavel = confirmavel;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getInformacoes() {
        return informacoes;
        
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
        return this;
    }

    public boolean isConfirmavel() {
        return confirmavel;
    }

    public void setConfirmavel(boolean confirmavel) {
        this.confirmavel = confirmavel;
        return this;
    }
    
    
    
}
