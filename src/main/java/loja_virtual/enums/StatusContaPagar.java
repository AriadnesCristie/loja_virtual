package loja_virtual.enums;

public enum StatusContaPagar {

    COBRANCA("pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    NEGOCIADA("Renegociada");

    private String descricao;

    private StatusContaPagar(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return this.descricao;
    }


}