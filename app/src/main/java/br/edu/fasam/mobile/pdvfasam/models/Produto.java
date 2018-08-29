package br.edu.fasam.mobile.pdvfasam.models;

import android.graphics.Bitmap;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by bruno on 28/08/18.
 */

public class Produto {

    protected Integer id;
    protected String nome;
    protected String descricao;
    protected String ncm;
    protected String codBarra;
    protected Bitmap foto;
    protected BigDecimal qtd;
    protected BigDecimal valorUnitario;

    public Produto(Integer id, String nome, String descricao, String ncm,
                   String codBarra, Bitmap foto,
                   BigDecimal qtd, BigDecimal valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ncm = ncm;
        this.codBarra = codBarra;
        this.foto = foto;
        this.qtd = qtd;
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal(){
        return valorUnitario.multiply(qtd);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ncm='" + ncm + '\'' +
                ", codBarra='" + codBarra + '\'' +
                ", foto=" + foto +
                ", qtd=" + qtd +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
