package jdev.mentoria.lojavirtual.loja_virtual;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


@Entity
@Table(name = "acesso")
@SequenceGenerator(name = "seq_acesso", sequenceName = "seq_acesso", initialValue = 1, allocationSize = 1)

    public class Acesso implements GrantedAuthority {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acesso")
    private Long id;


    @Column(nullable = false)
    private String descricao; /*Acesso ex: ROLE_ADMIN OU ROLE_SECRETARIO*/


    @Override
    public String getAuthority(){
        return this.descricao;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
            this.descricao = descricao;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Acesso other = (Acesso) obj;
        if (id == null){
            if(other.id != null)
                return false;
        }else if (!id.equals(other.id))
            return false;
        return true;
    }


}

