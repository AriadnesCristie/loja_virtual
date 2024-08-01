package jdev.mentoria.lojavirtual.loja_virtual;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "marca_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto" , allocationSize = 1, initialValue = 1)

public class MarcaProduto implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto" )
    private Long id;

    private String nomeDesc;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNomeDesc(){
        return nomeDesc;
    }
}
