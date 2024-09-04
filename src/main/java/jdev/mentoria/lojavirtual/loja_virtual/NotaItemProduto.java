package jdev.mentoria.lojavirtual.loja_virtual;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "nota_item_produto")
@SequenceGenerator(name = "seq_nota_item_produto", sequenceName = "seq_nota_item_produto" , allocationSize = 1, initialValue = 1)
public class NotaItemProduto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_item_produto")
    private Long id;

    @Column(nullable = false)
    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "nota_fiscal_compra_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_compra_fk"))
    private NotaFiscalCompra NotaFscalCompra;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public NotaFiscalCompra getNotaFscalCompra() {
        return NotaFscalCompra;
    }

    public void setNotaFscalCompra(NotaFiscalCompra notaFscalCompra) {
        NotaFscalCompra = notaFscalCompra;


    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NotaItemProduto other = (NotaItemProduto) obj;
        if (id == null){
            if (other.id != null)
                return false;
        }else if (!id.equals (other.id))
            return false;
        return true;
    }
}
