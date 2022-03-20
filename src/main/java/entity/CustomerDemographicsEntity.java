package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "CustomerDemographics", schema = "dbo", catalog = "Northwind")
@Table(name = "CustomerDemographics")
public class CustomerDemographicsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerTypeID")
    private String customerTypeId;
    @Basic
    @Column(name = "CustomerDesc")
    private String customerDesc;

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDemographicsEntity that = (CustomerDemographicsEntity) o;
        return Objects.equals(customerTypeId, that.customerTypeId) && Objects.equals(customerDesc, that.customerDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerTypeId, customerDesc);
    }
}
