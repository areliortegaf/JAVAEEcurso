/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeexml.xmlcollection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author asortega
 */
public class EscribirProductList {
    //
    //Imprime y crea el XML de una lista copn formato
    //

    public EscribirProductList() {
        escribir();
    }

    public void escribir() {
        List<Product> nuevaLista = new ArrayList<>();
        nuevaLista.add(new Product("Cuaderno", "cuadricula", 12, 5.60));
        nuevaLista.add(new Product("Pluma", "azul", 50, 3.80));
        nuevaLista.add(new Product("Lapiz", "granito", 80, 4.10));
        nuevaLista.add(new Product("Marcador", "amarillo", 30, 10.70));
        
        //instancia a la clase ProductList
        
        ProductList pl = new ProductList(nuevaLista);
        
        try{
            JAXBContext jc = JAXBContext.newInstance(ProductList.class);
            Marshaller m = jc.createMarshaller();
            
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            m.marshal(pl, new File("ProductList.xml"));
            m.marshal(pl, System.out);
            
        }catch(JAXBException e){
            System.out.println("Exception: " + e);
        }
    }

    public static void main(String[] args) {
        new EscribirProductList();
    }

}
