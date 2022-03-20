package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

//https://stackoverflow.com/questions/4826604/how-to-use-money-data-type-in-java-sql-orm
import java.math.BigDecimal;

@Entity
//@Table(name = "Orders", schema = "dbo", catalog = "Northwind")
@Table(name = "Orders")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderID")
    private int orderId;
    @Basic
    @Column(name = "CustomerID")
    private String customerId;
    @Basic
    @Column(name = "EmployeeID")
    private Integer employeeId;
    @Basic
    @Column(name = "OrderDate")
    private Date orderDate;
    @Basic
    @Column(name = "RequiredDate")
    private Date requiredDate;
    @Basic
    @Column(name = "ShippedDate")
    private Date shippedDate;
    @Basic
    @Column(name = "ShipVia")
    private Integer shipVia;
    @Basic
    @Column(name = "Freight")
    //private Object freight;
    private BigDecimal freight;
    @Basic
    @Column(name = "ShipName")
    private String shipName;
    @Basic
    @Column(name = "ShipAddress")
    private String shipAddress;
    @Basic
    @Column(name = "ShipCity")
    private String shipCity;
    @Basic
    @Column(name = "ShipRegion")
    private String shipRegion;
    @Basic
    @Column(name = "ShipPostalCode")
    private String shipPostalCode;
    @Basic
    @Column(name = "ShipCountry")
    private String shipCountry;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipVia() {
        return shipVia;
    }

    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }

    public Object getFreight() {
        return freight;
    }

    //public void setFreight(Object freight) {
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return orderId == that.orderId && Objects.equals(customerId, that.customerId) && Objects.equals(employeeId, that.employeeId) && Objects.equals(orderDate, that.orderDate) && Objects.equals(requiredDate, that.requiredDate) && Objects.equals(shippedDate, that.shippedDate) && Objects.equals(shipVia, that.shipVia) && Objects.equals(freight, that.freight) && Objects.equals(shipName, that.shipName) && Objects.equals(shipAddress, that.shipAddress) && Objects.equals(shipCity, that.shipCity) && Objects.equals(shipRegion, that.shipRegion) && Objects.equals(shipPostalCode, that.shipPostalCode) && Objects.equals(shipCountry, that.shipCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, employeeId, orderDate, requiredDate, shippedDate, shipVia, freight, shipName, shipAddress, shipCity, shipRegion, shipPostalCode, shipCountry);
    }
}
