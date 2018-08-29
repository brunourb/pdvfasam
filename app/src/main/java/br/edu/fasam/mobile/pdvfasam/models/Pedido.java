package br.edu.fasam.mobile.pdvfasam.models;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import br.edu.fasam.mobile.pdvfasam.enumerators.EnumTipoPagamento;

/**
 * Created by bruno on 28/08/18.
 */

public class Pedido {

    protected String numero;
    protected EnumTipoPagamento tipoPagamento;
    protected BigDecimal valor;
    protected List<Produto> produtos;

    public Pedido(String numero, EnumTipoPagamento tipoPagamento, BigDecimal valor) {
        this.numero = numero;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.produtos = new ArrayList<Produto>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public EnumTipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(EnumTipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * Cacula a preço do pedido;
     * Percorre a lista de produtos;
     * @return
     */
    public BigDecimal getValor() {

        BigDecimal valorTransiente = BigDecimal.ZERO;

        for (Produto produto : getProdutos()){
            valorTransiente.add(produto.getValorTotal());
        }
        setValor(valorTransiente);

        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero='" + numero + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                ", valor=" + valor +
                ", produtos=" + produtos +
                '}';
    }
}
