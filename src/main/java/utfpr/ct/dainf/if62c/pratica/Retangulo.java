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
import java.io.Serializable;

public class Retangulo implements FiguraComLados, Serializable {
    private double lado1;
    private double lado2;
    
    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    
    @Override
    public double getLadoMaior(){
        if(lado1 > lado2) return lado1;
        else return lado2;
    }
    
    
    @Override
    public double getLadoMenor(){
        if(lado1 < lado2) return lado1;
        else return lado2;
    }
    
    public double getPerimetro(){
        return 2*lado1+2*lado2;
    }
    

    public double getArea(){
        return lado1*lado2;
    }
    
    
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    
    @Override
    public String toString() {
        return getNome();
    }
    
}
