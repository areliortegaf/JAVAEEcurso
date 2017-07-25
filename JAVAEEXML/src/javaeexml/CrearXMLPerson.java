/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeexml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
/**
 *
 * @author asortega
 */
public class CrearXMLPerson {
    
    public CrearXMLPerson(){
        escribirXML();
    }
    
    public void escribirXML(){
        Person p = new Person("Pancho","Lopez",555222111,"Chihuahua Mexico");
        try{
            JAXBContext jc =  JAXBContext.newInstance(Person.class);
            Marshaller m = jc.createMarshaller();
            m.marshal(p, new File("Person.xml"));
            m.marshal(p, System.out);
        }catch(JAXBException e){
            System.out.println("Exception: " + e);
        }
            
    }
    
    public static void main(String[] args) {
        new CrearXMLPerson();
    }
}
