import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woich
 */
public class Pratica32 {
    
    public static double densidade(double x, double media, double desvio) {
        double d = (1.00/(Math.sqrt(2.00 * Math.PI) * desvio)) * (Math.pow(Math.E,(-(1.00/2.00) * Math.pow(((x-media)/desvio), 2))));
        return d;
    }
    
    public static void main(String[] args){
        Double densi;
        
        densi = densidade(-1.00, 67.00, 3.00);
        
        System.out.println(densi);
    }
}
