package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "CustomerCustomerDemo", schema = "dbo", catalog = "Northwind")
@Table(name = "CustomerCustomerDemo")
@IdClass(CustomerCustomerDemoEntityPK.class)
public class CustomerCustomerDemoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerID")
    private String customerId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerTypeID")
    private String customerTypeId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCustomerDemoEntity that = (CustomerCustomerDemoEntity) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(customerTypeId, that.customerTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerTypeId);
    }
}
