package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "Region", schema = "dbo", catalog = "Northwind")
@Table(name = "Region")
public class RegionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "RegionID")
    private int regionId;
    @Basic
    @Column(name = "RegionDescription")
    private String regionDescription;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionEntity that = (RegionEntity) o;
        return regionId == that.regionId && Objects.equals(regionDescription, that.regionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, regionDescription);
    }
}
