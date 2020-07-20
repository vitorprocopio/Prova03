package br.com.contmatic.contato;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// TODO: Auto-generated Javadoc
/**
 * The Class Contato.
 */
public class Contato {
    
	/** The telefone. */
	@Pattern(regexp = "\\d{8}", message = "O telefone deve conter somente 8 digítos numéricos")
    private String telefone;
    
	/** The celular. */
	@Pattern(regexp = "\\d{9}", message = "O celular deve conter somente 9 digítos numéricos")
	private String celular;
    
	/** The recado. */
	@Pattern(regexp = "\\d{8,9}", message = "O número para contato deve conter somente 8 ou 9 digítos numéricos")
    private String recado;
    
    /** The email. */
    @Email(message = "O endereço de email é inválido")
    private String email;
    
    /**
     * Instantiates a new contato.
     *
     * @param telefone the telefone
     * @param celular the celular
     * @param recado the recado
     * @param email the email
     */
    public Contato(String telefone, String celular, String recado, String email) {
        this.setTelefone(telefone);
        this.setCelular(celular);
        this.setRecado(recado);
        this.setEmail(email);
    }

    /**
     * Gets the telefone.
     *
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets the telefone.
     *
     * @param telefone the new telefone
     */
    public void setTelefone(String telefone) {
//        if(telefone != null) {
//        verificaTamanhoTelefone(telefone);
//        verificaContemSomenteNumeros(telefone);
//        }
    	this.telefone = telefone;
    }
    
//    private void verificaContemSomenteNumeros(String campo) {
//        for(char palavra: campo.toCharArray()) {
//            if(!Character.isDigit(palavra)) {
//                throw new IllegalArgumentException("Só deve conter números");
//            }
//        }
//    }
//
//    private void verificaTamanhoTelefone(String telefone) {
//        if(telefone.length() != 8) {
//           throw new IllegalArgumentException("O número deve conter 8 dígitos"); 
//        }
        
    /**
 * Gets the celular.
 *
 * @return the celular
 */
public String getCelular() {
        return celular;
    }

    /**
     * Sets the celular.
     *
     * @param celular the new celular
     */
    public void setCelular(String celular) {
//        if(celular != null) {
//        verificaTamanhoCelular(celular);
//        verificaContemSomenteNumeros(celular);
//        }
//    }
//
//    private void verificaTamanhoCelular(String celular) {
//        if(celular.length() != 9) {
//            throw new IllegalArgumentException("O número deve conter 9 dígitos"); 
//         }
        this.celular = celular;
    }

    /**
     * Gets the recado.
     *
     * @return the recado
     */
    public String getRecado() {
        return recado;
    }

    /**
     * Sets the recado.
     *
     * @param recado the new recado
     */
    public void setRecado(String recado) {
//        if(recado != null) {
//        verificaTamanhoRecado(recado);
//        verificaContemSomenteNumeros(recado);
//        }
//    }
//
//    private void verificaTamanhoRecado(String recado) {
//        if(recado.length() < 8 || recado.length() > 9) {
//            throw new IllegalArgumentException("O número deve conter 8 ou 9 dígitos"); 
//         }
        this.recado = recado;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
//        if(email != null) {
//        verificaTamanhoEmail(email);
//        }
//    }
//
//    private void verificaTamanhoEmail(String email) {
//        if(email.length() > 250) {
//            throw new IllegalArgumentException("O email deve ter até 100 caracteres");
//        }
//        for(char palavra: email.toCharArray()) {
//            if(Character.isSpaceChar(palavra)) {
//                throw new IllegalArgumentException("Não deve ter espaço");
//            }
//        }
        this.email = email;
    }
    
    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * To string.
     *
     * @return the string
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
    
}
