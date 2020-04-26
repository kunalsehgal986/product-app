package com.Infosys.productapp.entity;

import javax.persistence.*;

@Entity(name = "PRODUCT")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID")
    private Integer id;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
