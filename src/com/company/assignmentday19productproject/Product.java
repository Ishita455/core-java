package com.company.assignmentday19productproject;

import java.io.Serializable;

public class Product implements Serializable {
    Integer productId;
    String productName;
    String productDescription;
    Double productPrice;

    public Product(Integer productId, String productName, String productDescription, Double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
}

