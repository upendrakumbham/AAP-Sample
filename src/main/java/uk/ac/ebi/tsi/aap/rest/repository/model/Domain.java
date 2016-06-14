package uk.ac.ebi.tsi.aap.rest.repository.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by ukumbham on 31/05/2016.
 */
@Entity
@Table(name= "domains")
public class Domain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String domainName;

    private String domainDesc;

    public Domain(){

    }
    public  Domain(String domainName, String domainDesc){
        this.domainName = domainName;
        this.domainDesc = domainDesc;
    }
    public  Domain(Long id,String domainName, String domainDesc){
        this.domainName = domainName;
        this.domainDesc = domainDesc;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getDomainDesc() {
        return domainDesc;
    }

    public void setDomainDesc(String domainDesc) {
        this.domainDesc = domainDesc;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "id=" + id +
                ", domainName='" + domainName + '\'' +
                ", domainDesc='" + domainDesc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Domain)) return false;

        Domain domain = (Domain) o;

        if (!id.equals(domain.id)) return false;
        if (!domainName.equals(domain.domainName)) return false;
        return domainDesc.equals(domain.domainDesc);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + domainName.hashCode();
        result = 31 * result + domainDesc.hashCode();
        return result;
    }



}
