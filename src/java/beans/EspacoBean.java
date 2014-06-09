/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author Anderson
 */
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
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public boolean isConfirmavel() {
        return confirmavel;
    }

    public void setConfirmavel(boolean confirmavel) {
        this.confirmavel = confirmavel;
    }
    
    
    
}
