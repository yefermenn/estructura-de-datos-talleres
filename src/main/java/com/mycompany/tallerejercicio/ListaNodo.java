package com.mycompany.tallerejercicio;

import javax.swing.JOptionPane;

public class ListaNodo {
    Nodo primero;
    Nodo ultimo;
    ListaNodo(){
        primero=null;
        ultimo=null;
    }
    public void ingresar(String nombre){
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setAnterior(nuevo);
        nuevo.setSiguiente(nuevo);
        
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            
            ultimo=nuevo;
            ultimo.setSiguiente(primero);
            primero.setAnterior(ultimo);
        }
    }
    public void imprimmir(String nombre){
        Nodo temporal;
        Nodo referencia=null;
        temporal = primero;
        while(temporal!=ultimo){
            if(temporal.getNombre().equals(nombre)){
                referencia=temporal;
                break;
            }
            temporal=temporal.getSiguiente();
        }
        if(referencia==null){
            JOptionPane.showMessageDialog(null, "no se encontro el nodo");
        }else{
            temporal=referencia.getSiguiente();
            JOptionPane.showMessageDialog(null, "hacia adelante: "+referencia.getNombre());
            while(temporal!=referencia){
                JOptionPane.showMessageDialog(null, temporal.getNombre());
                temporal=temporal.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "hacia atras: "+referencia.getNombre());
            temporal=temporal.getAnterior();
            while(temporal!=referencia){
                JOptionPane.showMessageDialog(null, temporal.getNombre());
                temporal=temporal.getAnterior();
            }
        }
    }
    public void eliminar(String nombre){
        Nodo temporal;
        Nodo referencia=null;
        temporal = primero;
        while(temporal!=ultimo){
            if(temporal.getNombre().equals(nombre)){
                referencia=temporal;
                break;
            }
            temporal=temporal.getSiguiente();
        }
        
    }
}
