package br.edu.fasam.mobile.pdvfasam.enumerators;

/**
 * Created by bruno on 28/08/18.
 */

public enum EnumTipoPagamento {
    CREDITO(1,"Cartão de Crédito"),
    DEBITO(2,"Cartão de Débito"),
    CHEQUE(3,"Cheque não é dinheiro"),
    DINHEIRO(4,"Dinheiro"),
    PROMISSORIA(5,"Promissória");

    private Integer codigo;
    private String destricao;

    EnumTipoPagamento(Integer codigo,
                      String descricao){
        this.codigo = codigo;
        this.destricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDestricao() {
        return destricao;
    }

    public void setDestricao(String destricao) {
        this.destricao = destricao;
    }
}
