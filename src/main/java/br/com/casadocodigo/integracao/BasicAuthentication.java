package br.com.casadocodigo.integracao;

import java.util.Base64;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class BasicAuthentication {
    @Getter
    private String login;

    @Getter
    private String senha;

    public BasicAuthentication(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getCredenciaisBase64() {
        String credenciais = login + ":" + senha;
        String credenciaisCodificadasComBase64 = new String(
                Base64.getEncoder().encode(credenciais.getBytes()));

        return credenciaisCodificadasComBase64;
    }

}
