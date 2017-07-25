/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeexml.xmlcollection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asortega
 */
@XmlRootElement(name="ProductList")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductList {
    //FIELDS
    @XmlElement(name="product")
    private List<Product> pList = new ArrayList<>();
    //CONSTRUCTOR VACIO
    public ProductList(){}
    
    //CONSTRUCTOR CON ARGUMENTOS
    public ProductList (List<Product> pl){
        this.pList=pl;
    }
    
    public List<Product> getList(){
        return pList;
    }
    
    
    
}
