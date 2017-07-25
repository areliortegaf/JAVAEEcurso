/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeexml.xmlcollection;

/**
 *
 * @author asortega
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

//anotaciones jaxb
@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    private String name;
    private String description;
    private int quantity;
    private double price;

    //CONSTRUCTOR SIN ARGUMENTOS NECESARIO PARA JAXB
    public Product() {
    }

    public Product(String pName, String pDesc, int pQua, double pPrice) {
        this.name = pName;
        this.description = pDesc;
        this.quantity = pQua;
        this.price = pPrice;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public void setDesc(String pDesc) {
        this.description = pDesc;
    }

    public void setQuantity(int pQua) {
        this.quantity = pQua;
    }

    public void setPrice(double pPrice) {
        this.price = pPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

}
