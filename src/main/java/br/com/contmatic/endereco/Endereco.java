package br.com.contmatic.endereco;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import br.com.contmatic.enumerator.Estado;

public class Endereco {
    
	@Pattern(regexp = "\\d{8}", message = "O CEP deve conter somente 9 digítos numéricos")
	@NotNull(message = "Não deve conter CEP nulo")
    private String cep;
    
	@Pattern(regexp = "^[A-ZÀ-Úa-zà-ú_0-9][A-ZÀ-Ú a-zà-ú_0-9]{0,98}[A-ZÀ-Úa-zà-ú_0-9]$", message = "A rua deve ter até 100 caracteres alfanuméricos")
    @NotBlank(message = "Não deve aceitar rua nulo nem vazio")
    private String rua;
    
	@Min(value = 1, message = "O número deve ser maior ou igual a 1")
	@Max(value = 99999, message = "O número deve ser menor ou igual a 99999")
	@NotNull(message = "Não deve conter número nulo")
    private int numero; 
    
	@Pattern(regexp = "^[A-ZÀ-Úa-zà-ú_0-9]{0,1}[A-ZÀ-Ú a-zà-ú_0-9]{0,48}[A-ZÀ-Úa-zà-ú_0-9]{0,1}$", message = "O complemento deve ter até 50 caracteres alfanumericos")
    private String complemento;
    
    @Pattern(regexp = "^[A-ZÀ-Úa-zà-ú_0-9]{0,1}[A-ZÀ-Ú a-zà-ú_0-9]{0,48}[A-ZÀ-Úa-zà-ú_0-9]{0,1}$", message = "O bairro deve ter até 50 caracteres alfanumericos")
	@NotBlank(message = "Não deve conter bairro nulo")
    private String bairro;
    
    @Pattern(regexp = "^[A-ZÀ-Úa-zà-ú][A-ZÀ-Ú a-zà-ú]{0,48}[A-Za-zA-ZÀ-Úa-zà-ú]$", message = "A cidade deve ter até 50 caracteres alfanumericos")
	@NotBlank(message = "Não deve conter cidade nula nem vazia")
    private String cidade;
    
    @Valid
	@NotNull(message = "Não deve conter UF nulo")
    private Estado uf;
    
	@Pattern(regexp = "^[A-ZÀ-Úa-zà-ú][A-ZÀ-Ú a-zà-ú]{0,48}[A-Za-zA-ZÀ-Úa-zà-ú]$", message = "O país deve ter até 50 caracteres alfanumericos")
	@NotBlank(message = "Não deve conter país nulo")
    private String pais;
    
    public Endereco(String cep, String rua, int numero, String complemento, String bairro, String cidade, Estado uf, String pais) {
        this.setCep(cep);
        this.setRua(rua);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setUf(uf);
        this.setPais(pais);
    }
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
//        verificaCampoNulo(cep);
//        verificaCampoVazio(cep);
//        verificaTamanhoCep(cep);
//        verificaContemEspacos(cep);
//        verificaContemSomenteNumeros(cep);
        this.cep = cep;
    }
    
//    private void verificaContemSomenteLetrasEDigitos(String campo) {
//        for(char palavra: campo.toCharArray()) {
//            if(!(Character.isLetterOrDigit(palavra) || Character.isSpaceChar(palavra))) {
//                throw new IllegalArgumentException("Não deve conter caracteres especiais");
//            }
//        }
//    }

//    private void verificaContemEspacos(String campo) {
//        for(char palavra: campo.toCharArray()) {
//            if(Character.isSpaceChar(palavra)) {
//                throw new IllegalArgumentException("Não deve ter espaço");
//            }
//        }
//    }
//
//    private void verificaContemSomenteNumeros(String campo) {
//        for(char digito: campo.toCharArray()) {
//            if(!Character.isDigit(digito)) {
//                throw new IllegalArgumentException("Só deve conter números");
//            } 
//        }
//    }
//
//    private void verificaTamanhoCep(String cep) {
//        if(cep.length() != 8) {
//            throw new IllegalArgumentException("O CEP deve conter 8 dígitos"); 
//         }
//    }
//    
//    private void verificaCampoNulo(String campo) {
//        if (campo == null) {
//            throw new IllegalArgumentException("O número do campo não deve ser nulo");
//        }
//    }
//    
//    private void verificaCampoVazio(String campo) {
//        if(campo.isEmpty()) {
//            throw new IllegalArgumentException("Este campo não deve ser vazio");
//        }
//    }
    
    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
//        verificaCampoNulo(rua);
//        verificaCampoVazio(rua);
//        verificaEspacoInicio(rua);
//        verificaTamanhoRua(rua);
//        verificaContemSomenteLetrasEDigitos(rua);
        this.rua = rua;
    }
    
//    private void verificaEspacoInicio(String campo) {
//        if(campo.charAt(0) == ' ') {
//            throw new IllegalArgumentException("O campo não deve começar com espaços nem conter somente espaços");
//        }
//    }
//    
//    private void verificaTamanhoRua(String rua) {
//        if(rua.length() > 100) {
//            throw new IllegalArgumentException("O campo deve conter até 100 caracteres"); 
//         }
//    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
//        if(numero < 0 || numero > 99999) {
//            throw new IllegalArgumentException("O número deve ser de 0 até 99999");
//        }
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
//        if(complemento != null) {
//        verificaTamanhoAteCinquenta(complemento);
//        verificaContemSomenteLetrasEDigitos(complemento);
        this.complemento = complemento;
        }
    
//    private void verificaTamanhoAteCinquenta(String campo) {
//        if(campo.length() > 50) {
//            throw new IllegalArgumentException("O campo deve conter até 100 caracteres"); 
//        }
//    }
//    
    public String getBairro() {
        return bairro;
    }
    
    
    public void setBairro(String bairro) {
//        verificaCampoNulo(bairro);
//        verificaCampoVazio(bairro);
//        verificaTamanhoAteCinquenta(bairro);
//        verificaEspacoInicio(bairro);
//        verificaContemSomenteLetrasEDigitos(bairro);
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
//        verificaCampoNulo(cidade);
//        verificaCampoVazio(cidade);
//        verificaEspacoInicio(cidade);
//        verificaTamanhoAteCinquenta(cidade);
//        verificaContemSomenteLetrasEDigitos(cidade);
        this.cidade = cidade;
    }
    
    public Estado getUf() {
        return uf;
    }
    
    public void setUf(Estado uf) {
//        verificaCampoNulo(uf);        
//        verificaContemSomenteLetras(uf);
//        verificaTamanhoUf(uf);
        this.uf = uf;
    }
    
//    private void verificaContemSomenteLetras(String campo) {
//        for(char digito: campo.toCharArray()) {
//            if(!Character.isLetter(digito)) {
//                throw new IllegalArgumentException("Só deve conter letras");
//            } 
//        }
//    }
//    
//    private void verificaTamanhoUf(String uf) {
//        if(uf.length() != 2) {
//            throw new IllegalArgumentException("O CEP deve conter 8 dígitos"); 
//         }
//    }
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
//        verificaCampoNulo(pais);   
//        verificaCampoVazio(pais);
//        verificaEspacoInicio(pais);
//        verificaTamanhoAteCinquenta(pais);
//        verificaContemSomenteAlfabeto(pais);
        this.pais = pais;
    }
    
//    private void verificaContemSomenteAlfabeto(String campo) {
//        for(char palavra: campo.toCharArray()) {
//            if(!(Character.isAlphabetic(palavra) || Character.isSpaceChar(palavra))) {
//                throw new IllegalArgumentException("Só deve conter letras");
//            }
//        }
//    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Endereco))
            return false;
        Endereco other = (Endereco) obj;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        if (cidade == null) {
            if (other.cidade != null)
                return false;
        } else if (!cidade.equals(other.cidade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Endereco [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf.getUf() + ", pais=" + pais + "]";
    }
    
}
