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

public class Elipse implements FiguraComEixos, Serializable {
    private double eixo1;
    private double eixo2;
    
    public Elipse(double eixo1, double eixo2){
        this.eixo1 = 2*eixo1;
        this.eixo2 = 2*eixo2;
    }
    
    @Override
    public double getArea(){
        return Math.PI*(eixo1/2)*(eixo2/2);
    }
    
    @Override
    public double getPerimetro(){
        return (3*(eixo1/2+eixo2/2)-Math.sqrt((3*eixo1/2+eixo2/2)*(eixo1/2+3*eixo2/2)))*Math.PI;
    }
    
    @Override
    public double getEixoMaior(){
        if(eixo1 > eixo2) return eixo1;
        else return eixo2;
    }
    
    @Override
    public double getEixoMenor(){
        if(eixo1 > eixo2) return eixo2;
        else return eixo1;
    }
    
        @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getNome();
    }
    
}
