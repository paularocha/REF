

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

    
    public String getInformacoes() {
        return informacoes;
        
    }
    public boolean isConfirmavel() {
        return confirmavel;
    }
    
    public EspacoBean setConfirmavel(boolean confirmavel) {
        this.confirmavel = confirmavel;
        return this;
    }

    public EspacoBean setInformacoes(String informacoes) {
        this.informacoes = informacoes;
        return this;
    }
    
    public EspacoBean setNome(String nome) {
        this.nome = nome;
        return this;
    }


    


}
