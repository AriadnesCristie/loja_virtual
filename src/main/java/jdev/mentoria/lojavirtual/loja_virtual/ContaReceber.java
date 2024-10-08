package jdev.mentoria.lojavirtual.loja_virtual;
import loja_virtual.enums.StatusContaReceber;
import loja_virtual.enums.TipoEndereco;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "conta_receber")
@SequenceGenerator(name = "seq_conta_receber", sequenceName = "seq_conta_receber" , allocationSize = 1, initialValue = 1)
public class ContaReceber implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_receber" )
        private Long id;

        private String descricao;

        @Enumerated(EnumType.STRING)
        private StatusContaReceber status;

        @Temporal(TemporalType.DATE)
        private Date dtVencimento;

        @Temporal(TemporalType.DATE)
        private Date dtPagamento;

        private BigDecimal valorTotal;

        private BigDecimal valorDesconto;


        @ManyToOne
        @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
        private Pessoa pessoa;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescricão() {
            return descricao;
        }

        public void setDescricão(String descricão) {
            this.descricao = descricão;
        }

        public StatusContaReceber getStatus() {
            return status;
        }

        public void setStatus(StatusContaReceber status) {
            this.status = status;
        }

        public Date getDtVencimento() {
            return dtVencimento;
        }

        public void setDtVencimento(Date dtVencimento) {
            this.dtVencimento = dtVencimento;
        }

        public Date getDtPagamento() {
            return dtPagamento;
        }

        public void setDtPagamento(Date dtPagamento) {
            this.dtPagamento = dtPagamento;
        }

        public BigDecimal getValorTotal() {
            return valorTotal;
        }

        public void setValorTotal(BigDecimal valorTotal) {
            this.valorTotal = valorTotal;
        }

        public BigDecimal getValorDesconto() {
            return valorDesconto;
        }

        public void setValorDesconto(BigDecimal valorDesconto) {
            this.valorDesconto = valorDesconto;
        }

        public Pessoa getPessoa() {
            return pessoa;
        }

        public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
        }

        @Override
    public boolean equals (Object obj){
            if(this == obj)
                return true;
            if(obj ==null)
                return false;
            if(getClass() != obj.getClass())
                return false;
            ContaReceber other = (ContaReceber) obj;
            if(id == null){
                if (other.id !=null)
                    return false;
            }else if (!id.equals(other.id))
                return false;
            return true;
        }
    }



