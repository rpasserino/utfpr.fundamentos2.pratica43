/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author user
 */
public class Circulo extends Elipse {
    
    public Circulo(double raio){
        super(raio, raio);
    }
    
    @Override
    public double getPerimetro(){
        return getEixoMenor()*2*Math.PI;
    }
}
