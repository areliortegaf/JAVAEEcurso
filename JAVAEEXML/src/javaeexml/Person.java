/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeexml;

/**
 *https://docs.oracle.com/cd/E19575-01/819-3669/6n5sg7bj5/index.html
 * IMPORTS DE JAXB
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


//AGREGAMOS LAS ANOTACIONES
//NO TERMINAN CONN PUNTO Y COMA
@XmlRootElement(name="Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    
    private String name;
    private String lastname;
    private int phone;
    private String address;
    
    public Person(){
        
    }
    
    public Person(String pName, String pLast, int pPhone, String pAddress){
        this.name = pName;
        this.lastname = pLast;
        this.phone = pPhone;
        this.address = pAddress;
    }
    
    public void setName(String pName){
        this.name = pName;
    }
    
    public void setLastName(String pLastName){
        this.lastname = pLastName;
    }
    
    public void setPhone(int pPhone){
        this.phone = pPhone;
    }
    
    public void setAddress(String pAdd){
        this.address = pAdd;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastName(){
        return this.lastname;
    }
    
    public int getPhone(){
        return this.phone;
    }
    
    public String getAdrress(){
        return this.address;
    }
    
    
    
}
