package br.edu.fasam.mobile.pdvfasam.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 28/08/18.
 */

public class Usuario {

    protected String nome;
    protected String email;
    protected String endereco;
    protected List<Pedido> pedido;

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.pedido = new ArrayList<Pedido>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List getPedido() {
        return pedido;
    }

    public void setPedido(List pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pedido=" + pedido +
                '}';
    }
}
