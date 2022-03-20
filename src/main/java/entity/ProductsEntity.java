package entity;

import javax.persistence.*;
import java.util.Objects;

// https://stackoverflow.com/questions/4826604/how-to-use-money-data-type-in-java-sql-orm
import java.math.BigDecimal;

// " javax.persistence.PersistenceException: [PersistenceUnit: PersistenceUnit] Unable to build Hibernate SessionFactory
// Caused by: org.hibernate.MappingException: property mapping has wrong number of columns: entity.ProductsEntity.unitPrice type: object

@Entity
//@Table(name = "Products", schema = "dbo", catalog = "Northwind")
@Table(name = "Products")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProductID")
    private int productId;
    @Basic
    @Column(name = "ProductName")
    private String productName;
    @Basic
    @Column(name = "SupplierID")
    private Integer supplierId;
    @Basic
    @Column(name = "CategoryID")
    private Integer categoryId;
    @Basic
    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;
    @Basic
    @Column(name = "UnitPrice")
    //private Object unitPrice;
    private BigDecimal unitPrice;
    @Basic
    @Column(name = "UnitsInStock")
    private Short unitsInStock;
    @Basic
    @Column(name = "UnitsOnOrder")
    private Short unitsOnOrder;
    @Basic
    @Column(name = "ReorderLevel")
    private Short reorderLevel;
    @Basic
    @Column(name = "Discontinued")
    private boolean discontinued;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Object getUnitPrice() {
        return unitPrice;
    }

    //public void setUnitPrice(Object unitPrice) {
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return productId == that.productId && discontinued == that.discontinued && Objects.equals(productName, that.productName) && Objects.equals(supplierId, that.supplierId) && Objects.equals(categoryId, that.categoryId) && Objects.equals(quantityPerUnit, that.quantityPerUnit) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(unitsInStock, that.unitsInStock) && Objects.equals(unitsOnOrder, that.unitsOnOrder) && Objects.equals(reorderLevel, that.reorderLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, supplierId, categoryId, quantityPerUnit, unitPrice, unitsInStock, unitsOnOrder, reorderLevel, discontinued);
    }
}
