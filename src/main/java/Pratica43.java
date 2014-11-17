/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Figura;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

public class Pratica43 {
    
    public static final String FORMAT_MSG = "%s de %s = %g";
    public static void main( String[] args ){
        Figura[] figuras = new Figura[5];
        
        figuras[0] = (Figura) new Retangulo(3, 4);
        figuras[1] = (Figura) new Quadrado(8);
        figuras[2] = (Figura) new TrianguloEquilatero(10);
        figuras[3] = new Circulo(5);
        figuras[4] = new Elipse(10, 20);
        
        for(Figura f : figuras){
            System.out.println(String.format(FORMAT_MSG, "Área", f, f.getArea()));
            System.out.println(String.format(FORMAT_MSG, "Perímetro", f, f.getPerimetro()));
            System.out.println();
        }
    }
}
