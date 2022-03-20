package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "EmployeeTerritories", schema = "dbo", catalog = "Northwind")
@Table(name = "EmployeeTerritories")
@IdClass(EmployeeTerritoriesEntityPK.class)
public class EmployeeTerritoriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EmployeeID")
    private int employeeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TerritoryID")
    private String territoryId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeTerritoriesEntity that = (EmployeeTerritoriesEntity) o;
        return employeeId == that.employeeId && Objects.equals(territoryId, that.territoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, territoryId);
    }
}
