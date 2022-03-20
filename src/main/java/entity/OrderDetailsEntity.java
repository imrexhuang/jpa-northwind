package entity;

import javax.persistence.*;
import java.util.Objects;

//https://stackoverflow.com/questions/4826604/how-to-use-money-data-type-in-java-sql-orm
import java.math.BigDecimal;

@Entity
//@Table(name = "Order Details", schema = "dbo", catalog = "Northwind")
@Table(name = "Order Details")
@IdClass(OrderDetailsEntityPK.class)
public class OrderDetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderID")
    private int orderId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProductID")
    private int productId;
    @Basic
    @Column(name = "UnitPrice")
    //private Object unitPrice;
    private BigDecimal unitPrice;
    @Basic
    @Column(name = "Quantity")
    private short quantity;
    @Basic
    @Column(name = "Discount")
    private float discount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Object getUnitPrice() {
        return unitPrice;
    }

    //public void setUnitPrice(Object unitPrice) {
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailsEntity that = (OrderDetailsEntity) o;
        return orderId == that.orderId && productId == that.productId && quantity == that.quantity && Float.compare(that.discount, discount) == 0 && Objects.equals(unitPrice, that.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId, unitPrice, quantity, discount);
    }
}
