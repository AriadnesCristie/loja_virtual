package jdev.mentoria.lojavirtual.loja_virtual;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "testexu")
@SequenceGenerator(name = "seq_testexu", sequenceName = "seq_testexu", allocationSize = 1, initialValue = 1)
public class Testexu implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_testexu")
    private Long id;

    @Column(name = "nome_desc", nullable = false)
    private String nomeDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDesc() {
        return nomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        this.nomeDesc = nomeDesc;
    }

}

