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
public class TrianguloEquilatero extends Retangulo{
    
    public TrianguloEquilatero(double lado){
        super(lado, lado * Math.sqrt(3) / 2);
    }
    
    @Override
    public double getPerimetro(){
        return 3*getLadoMaior();
    }
    
    @Override
    public double getArea(){
        return getLadoMenor()*getLadoMaior()/2;
    }
    
}