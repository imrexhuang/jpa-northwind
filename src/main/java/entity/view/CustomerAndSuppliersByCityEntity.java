package entity.view;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.RowId;

import java.util.Objects;
/*
create view [dbo].[Customer and Suppliers by City] AS
SELECT City, CompanyName, ContactName, 'Customers' AS Relationship 
FROM Customers
UNION SELECT City, CompanyName, ContactName, 'Suppliers'
FROM Suppliers

 * */
@Entity
//@Table(name = "Customer and Suppliers by City", schema = "dbo", catalog = "Northwind")
@Table(name = "Customer and Suppliers by City")
public class CustomerAndSuppliersByCityEntity {
    @Id
    @Column(name = "ID")
    private Long id;//原本的View沒有ID
    @Basic
    @Column(name = "City")
    private String city;
    @Basic
    @Column(name = "CompanyName")
    private String companyName;
    @Basic
    @Column(name = "ContactName")
    private String contactName;
    @Basic
    @Column(name = "Relationship")
    private String relationship;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAndSuppliersByCityEntity that = (CustomerAndSuppliersByCityEntity) o;
        return Objects.equals(city, that.city) && Objects.equals(companyName, that.companyName) && Objects.equals(contactName, that.contactName) && Objects.equals(relationship, that.relationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, companyName, contactName, relationship);
    }
}
