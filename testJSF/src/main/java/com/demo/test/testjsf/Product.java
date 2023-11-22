/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.test.testjsf;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Product {

    private String countryName;
    private String password;
    private String itemName;
    private String productDesc;
    private String capital;
    private LocalDate date;

    public Product(String countryName, String password, String itemName, String productDesc, String capital, LocalDate date) {
        this.countryName = countryName;
        this.password = password;
        this.itemName = itemName;
        this.productDesc = productDesc;
        this.capital = capital;
        this.date = date;
    }

    public String getProductCode() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
}
