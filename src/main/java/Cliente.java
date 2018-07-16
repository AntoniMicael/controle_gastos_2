/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Cliente {

    /**
     * @return the codidentificacao
     */
    public String getCodidentificacao() {
        return codidentificacao;
    }

    /**
     * @param codidentificacao the codidentificacao to set
     */
    public void setCodidentificacao(String codidentificacao) {
        this.codidentificacao = codidentificacao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nomefantasia
     */
    public String getNomefantasia() {
        return nomefantasia;
    }

    /**
     * @param nomefantasia the nomefantasia to set
     */
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    /**
     * @return the razaosocial
     */
    public String getRazaosocial() {
        return razaosocial;
    }

    /**
     * @param razaosocial the razaosocial to set
     */
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    /**
     * @return the tipocliente
     */
    public String getTipocliente() {
        return tipocliente;
    }

    /**
     * @param tipocliente the tipocliente to set
     */
    public void setTipocliente(String tipocliente) {
        this.tipocliente = tipocliente;
    }
    
    private String codidentificacao;
    private String email;
    private String nomefantasia;
    private String razaosocial;
    private String tipocliente;
    
}
