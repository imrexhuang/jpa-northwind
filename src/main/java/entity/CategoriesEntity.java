package entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
//@Table(name = "Categories", schema = "dbo", catalog = "Northwind")
@Table(name = "Categories")
public class CategoriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CategoryID")
    private int categoryId;
    @Basic
    @Column(name = "CategoryName")
    private String categoryName;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "Picture")
    private byte[] picture;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesEntity that = (CategoriesEntity) o;
        return categoryId == that.categoryId && Objects.equals(categoryName, that.categoryName) && Objects.equals(description, that.description) && Arrays.equals(picture, that.picture);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(categoryId, categoryName, description);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
